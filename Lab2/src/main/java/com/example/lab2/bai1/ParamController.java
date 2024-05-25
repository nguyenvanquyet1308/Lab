package com.example.lab2.bai1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ParamController {

    @RequestMapping("/param/form")
    public String form() {
        return "form";
    }

    @RequestMapping("/param/save/{x}")
    public String save(@PathVariable("x") String x, @RequestParam("y") String y) {
        return "form";
    }
}
