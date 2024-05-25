	
package com.example.lab2.bai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("ctrl")
public class OkController {
    @Autowired
    HttpServletRequest request;
    @RequestMapping("ok")
    public String ok() {
        request.setAttribute("message", "ok");
        return "ok";
    }

    @PostMapping("ok")
    public String m1() {
        request.setAttribute("message", "m1");
        return "ok";
    }

    @GetMapping("ok")
    public String m2() {
        request.setAttribute("message", "m2");
        return "ok";

    }
    @RequestMapping(value = "ok" , params = "x")
    public String m3() {
        request.setAttribute("message", "m3");
        return "ok";
    }
}