package com.umin.news.controllers;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    long index=0;

    @GetMapping("/")
    public String home(Model model) {
        index+=1;
        model.addAttribute("value", index);
        model.addAttribute("valueCount","Number of visits to the page: ");
        model.addAttribute("title", "UMIN CORP.");
        return "home";
    }

}
