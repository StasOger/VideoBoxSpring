package com.musicBox.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FavoritesController {
    @GetMapping("/favorites")
    public String favorites (Model model) {

        return "favorites";
    }
}
