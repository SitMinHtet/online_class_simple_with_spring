package com.smh.onlineclasstest.controller;

import com.smh.onlineclasstest.entity.Application;
import com.smh.onlineclasstest.entity.OnlineClass;
import com.smh.onlineclasstest.service.ClassServiceImpl;
import com.smh.onlineclasstest.service.ClassesService;
import com.smh.onlineclasstest.service.RegisterService;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@Data
public class PublicController {

    private final ClassesService classesService;
    private final RegisterService registerService;

    @GetMapping
    public String create(Model model) {
        model.addAttribute("class", classesService.findAll());
        return "views/public/home";
    }


    @GetMapping("/showClasses/{id}")
    public String showProductByCategoryId(@PathVariable int id, Model model) {
        model.addAttribute("allClasses", classesService.findByClassesID(id));
        return "views/public/classDetail";
    }

    @GetMapping("/showClasses/{id}/join")
    public String joinClass(@PathVariable int id, Model model) {
        model.addAttribute("joinClass", classesService.findByClassesID(id));
        model.addAttribute("create", new Application());
        return "views/public/joinClass";
    }

    @PostMapping("/showClasses/{id}/join")
    public String process(Application application,@PathVariable int id, Model model, BindingResult result){
        if(result.hasErrors()){
            return "views/public/joinClass";
        }
        registerService.create(application);
        return "redirect:/showClasses/{id}/result";
    }

    @GetMapping("/showClasses/{id}/result")
    public String showAllCategory(@PathVariable int id,Model model){
        model.addAttribute("allMem", registerService.findAll());
        return "views/public/RegisterMem";
    }

}
