package com.example.website.controller;

import com.example.website.service.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SubscribeController {
    @Autowired
    SubscribeService subscribeService;

    @PostMapping("/subscribe")
    public String subscribe(@RequestParam String email, String url) {
        subscribeService.subscribe(email);
        return "redirect:/" + url;
    }

    @GetMapping("/subscribe")
    public String subscribe(@RequestParam String email) {
        subscribeService.subscribe(email);
        return "redirect:/";
    }
}
