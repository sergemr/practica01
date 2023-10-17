package com.practica01.practica01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/web")
public class WebController {

    @GetMapping
    public String systemInfo() {

        return "hello-web";
    }

}
