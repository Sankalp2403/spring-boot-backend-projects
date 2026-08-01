package com.pro.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Must be @Controller (NOT @RestController) for JSPs to load
public class HomeController {

    // 1. Handles opening http://localhost:8080/ in browser
    @GetMapping("/")
    public String showHomePage() {
        return "index"; // loads /WEB-INF/views/index.jsp
    }

    // 2. Handles clicking the Calculate button
    @PostMapping("/calculate")
    public String calculate(
            @RequestParam("no1") float no1,
            @RequestParam("no2") float no2,
            @RequestParam("operation") int operation,
            Model model) {

        Calculator calc = new Calculator();
        float result = 0;

        switch (operation) {
            case 1 -> result = calc.Add(no1, no2);
            case 2 -> result = calc.Sub(no1, no2);
            case 3 -> result = calc.Multiply(no1, no2);
            case 4 -> result = calc.Divide(no1, no2);
        }

        model.addAttribute("no1", no1);
        model.addAttribute("no2", no2);
        model.addAttribute("result", result);

        return "index";
    }
}