package com.aalegz.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage() {
        System.out.println(">> showPage()");
        return "main-menu";
    }

    /*@RequestMapping("/spring-mvc-demo/")
    public String showSecondPage() {
        System.out.println(">> showSecondPage()");
        return "main-menu";
    }*/
}
