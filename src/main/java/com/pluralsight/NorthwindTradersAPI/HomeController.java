package com.pluralsight.NorthwindTradersAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "home")
    public String renderHomePage(){
        return "Hello World";
    }
}
