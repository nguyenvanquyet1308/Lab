package com.example.lab5.lab6.bai2;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.lab5.RepositoryEntity.ProductRepository;
import com.example.lab5.entity.Product;

@Controller
public class ProductControllerSearchPage {
	@Autowired
	SessionService session;
	@Autowired
	ProductRepository dao;

	
      @RequestMapping("/product/searchPage")
      
      public String searchAndPage(Model model,
    		  @RequestParam("keywords") Optional<String> kw,
    		  @RequestParam("p") Optional<Integer> p) {
    	  
    	  String kwords = kw.orElse(session.get("keywords", ""));
    	  session.set("keywords", kwords);
    	  Pageable pageable = PageRequest.of(p.orElse(0), 5);
    	  Page<Product> page = dao.findByKeywords("%"+kwords+"%", pageable);
    	  model.addAttribute("searchPage", page);
    	  
    	  return "product/searchPage";
      }
	
}
