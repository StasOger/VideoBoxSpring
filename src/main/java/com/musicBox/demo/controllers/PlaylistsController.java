package com.musicBox.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlaylistsController {
    @GetMapping("/playlists")
    public String playlists (Model model) {

        return "playlists";
    }
}
