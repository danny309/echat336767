package com.example.echat33;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {


    @RequestMapping(value = "/springBoot/test")
    public @ResponseBody String say() {
        return "Hello,springBoot!";
    }

}