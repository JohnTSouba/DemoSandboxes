package com.tsg.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    private List<String> visitors = new ArrayList<>();

    @PostMapping("/visitor")
    public String handlePostRequest(String visitorName) {
        visitors.add(visitorName);
        return "redirect:/visitor";
    }

    @GetMapping("/visitor")
    public String handleGetRequest(Model model) {
        model.addAttribute("visitors", visitors);
        return "visitor-view";
    }

}
