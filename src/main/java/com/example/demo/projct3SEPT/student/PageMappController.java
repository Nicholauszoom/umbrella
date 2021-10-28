package com.example.demo.projct3SEPT.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageMappController {
    @RequestMapping("/")
    public ModelAndView getLogin() {
        return new ModelAndView("abouts");
    }

    @GetMapping("/about")
    public String getAbout(){
        return "aboutpg";
    }
    @GetMapping("/Team")
    public String getTeam(){
        return "team";
    }
}

