package com.smh.onlineclasstest.controller;

import com.smh.onlineclasstest.entity.Application;
import com.smh.onlineclasstest.entity.OnlineClass;
import com.smh.onlineclasstest.service.RegisterService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Data
public class ApplicationController {

    private final RegisterService registerService;

/*
    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("create", new Application());
        return "views/public/test";
    }

    @PostMapping("result")
    public String process(Application application, Model model, BindingResult result){
        if(result.hasErrors()){
            return "views/public/test";
        }
        registerService.create(application);
        return "redirect:/registerMem";
    }

    @GetMapping("registerMem")
    public String showAllCategory(Model model){
        model.addAttribute("allMem", registerService.findAll());
        return "views/public/RegisterMem";
    }



 */
}
