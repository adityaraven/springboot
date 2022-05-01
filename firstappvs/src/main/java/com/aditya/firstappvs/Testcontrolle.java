package com.aditya.firstappvs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Testcontrolle {
    @RequestMapping("/test")
    @ResponseBody
    public String hndle(){
        return "Hello Buddy";
    }
}
