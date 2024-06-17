package com.assignment.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.assignment.dao.CustomerDAO;
import com.assignment.entity.Customer;
import com.assignment.library.Cart;
import com.assignment.library.MailerServiceImpl;
import com.assignment.library.ShoppingCartService;

import jakarta.mail.MessagingException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Controller
@SessionAttributes("customer")
public class CheckLogin {

	@Autowired
	CustomerDAO customerService;

	@Autowired
	HttpServletRequest request;

	@Autowired
	ShoppingCartService cartService;

	@Autowired
	CustomerDAO daoCustomer;

	@Autowired
	MailerServiceImpl mailer;

	int emailbody = (int) (Math.random() * 90000) + 10000;

	@PostMapping("/dangNhap")
	public String Login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
		try {
			Customer account = customerService.findByEmail(email);

			if (account != null && account.getPassword().equals(password)) {
				// model.addAttribute("user",account);
				request.getSession().setAttribute("user", account);
				if (account.isAdmin()) {
					System.out.println("thành công vào admin");
					return "redirect:";

				} else {
					System.out.println("thành công vào user");
					return "redirect:";
				}
			} else {
				model.addAttribute("error", "email hoặc mật khẩu sai!");
				System.out.println("lỗi 1 ");
				return "/viewLogin/dangNhap";
			}
		} catch (Exception e) {
			model.addAttribute("message", "Đã xảy ra lỗi. Vui lòng thử lại!");
			System.out.println("lỗi 2 " + e);
			return "/viewLogin/dangNhap";
		}
	}

	@RequestMapping("/dangXuat")
	public String Logout(HttpSession session) {
		request.getSession().setAttribute("user", null);
		Cart cart = cartService.getCart(session);
		cart.clear();
		return "redirect:/dangNhap";

	}

	@GetMapping("/dangKy")
	public String dangKy(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "viewLogin/dangKy";
	}


    @PostMapping("/dangKy")
    public String DangKy(@Valid @RequestParam("email") String email, @ModelAttribute("customer") Customer customer,
                         BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "viewLogin/dangKy";
        } else if (customerService.findByEmail(customer.getEmail()) != null) {
            model.addAttribute("error", "Email Đã tồn tại");
            return "viewLogin/dangKy";
        } else if (!customer.getPassword().equals(customer.getConfirmPassword())) {
            model.addAttribute("error", "Password không trùng nhau");
            return "viewLogin/dangKy";
        } else {
            try {
                mailer.send(email, "Thư gửi mã xác nhận gmail", String.valueOf(emailbody));
                System.out.println("đã gửi gmail");
            } catch (MessagingException e) {
                System.out.println("lỗi" + e);
            }
           
        }
        return "viewLogin/checkEmail";
    }

    @RequestMapping(value = "/checkEmail", method = RequestMethod.POST)
    public String checkEmail(@ModelAttribute("customer") Customer customer, @RequestParam("MaOTP") Integer MaOTP, Model model) {
        if (MaOTP.equals(emailbody)) {
            customer.setAdmin(false);
            customer.setRegisteredDate(new Date());
            daoCustomer.save(customer);
            return "viewLogin/dangNhap";
        } else {
            model.addAttribute("error", "Mã OTP không phù hợp");
            return "viewLogin/checkEmail";
        }
    }

	@PostMapping("/doimatkhau")
	public String DoiMatKhau(@ModelAttribute("customer") Customer item, @RequestParam("password") String password,
			@RequestParam("newPassword") String newPassword, @RequestParam("confirmPassword") String confirmPassword,
			Model model) {
		Optional<Customer> optionalCustomer = daoCustomer.findById(item.getCustomerId());
		Customer updateCustomer = optionalCustomer.get();
		System.out.println("customerpasss" + updateCustomer.getPassword());
		if (!updateCustomer.getPassword().equals(password)) {
			model.addAttribute("message", "mật khẩu hiện tại ko đúng !");
			System.out.println("mật khẩu hiện tại ko đúng");
			return "redirect:/hoSo/" + item.getCustomerId();
		} else if (!newPassword.equals(confirmPassword)) {
			model.addAttribute("message", "2 mật khẩu không trùng nhau !");
			System.out.println("2 mật khẩu không trùng nhau ko đúng");
			return "redirect:/hoSo/" + item.getCustomerId();
		} else {
			updateCustomer.setPassword(confirmPassword);
			daoCustomer.save(updateCustomer);
			model.addAttribute("message", "cập nhật mật khẩu thành công !");
			System.out.println("cập nhật thành công");

		}

		return "redirect:/hoSo/" + item.getCustomerId();
	}
//	@Transactional
//    public void updateCustomer(Integer id, Customer updatedCustomer) {
//        Optional<Customer> optionalCustomer = daoCustomer.findById(id);
//        if (optionalCustomer.isPresent()) {
//            Customer customer = optionalCustomer.get();
//            customer.setName(updatedCustomer.getName());
//            customer.setPhone(updatedCustomer.getPhone());
//            
//            daoCustomer.save(customer);
//        } else {
//            // Handle customer not found
//            throw new RuntimeException("Customer not found with id " + id);
//        }
//    }
//	@PostMapping("/doimatkhau")
//	public String DoiMatKhau(@ModelAttribute("customer") Customer item , Model model) {
//          
//		Customer updateCustomer = new Customer();
//		
//		daoCustomer.save(item);
//	
//		
//
//		return "redirect:/hoSo";
//	}

}
