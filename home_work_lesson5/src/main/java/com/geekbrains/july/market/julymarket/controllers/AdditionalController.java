package com.geekbrains.july.market.julymarket.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdditionalController {
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
}