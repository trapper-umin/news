package com.umin.news.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {

    @GetMapping("/do")
    public String toDo(Model model){
        model.addAttribute("ToDo", "ToDo");
        return "do";
    }

}
