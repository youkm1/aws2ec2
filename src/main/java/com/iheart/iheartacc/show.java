package com.iheart.iheartacc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class show {
    @GetMapping("/")
    String showPage() {
        return "index";
    }
}