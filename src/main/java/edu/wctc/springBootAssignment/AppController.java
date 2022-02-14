package edu.wctc.springBootAssignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {
    @RequestMapping("/")
    public String showHomePage(){ return "index"; }

    @RequestMapping("/pages/acknowledge")
    public String showStepOne(){ return "/pages/acknowledge";}

    @RequestMapping("/pages/touch")
    public String showStepTwo(){ return "/pages/touch";}

    @RequestMapping("/pages/move")
    public String showStepThree(){ return "/pages/move";}
}
