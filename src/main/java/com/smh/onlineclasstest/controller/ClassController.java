package com.smh.onlineclasstest.controller;

import com.smh.onlineclasstest.entity.Application;
import com.smh.onlineclasstest.entity.OnlineClass;
import com.smh.onlineclasstest.service.ClassesService;
import com.smh.onlineclasstest.service.RegisterService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@Data
public class ClassController {

    private final ClassesService classesService;
    private final RegisterService registerService;

    @GetMapping("createClass")
    public String create(Model model){
        model.addAttribute("createClass", new OnlineClass());
        return "views/admin/classForm";
    }

    @PostMapping("showClasses")
    public String process(OnlineClass onlineClass, Model model, BindingResult result){
        if(result.hasErrors()){
            return "views/admin/classForm";
        }
        classesService.create(onlineClass);
        return "redirect:/classShowForm";
    }

    @GetMapping("classShowForm")
    public String showAllCategory(Model model){
        model.addAttribute("allClasses", classesService.findAll());
        return "views/admin/classShowForm";
    }

}
