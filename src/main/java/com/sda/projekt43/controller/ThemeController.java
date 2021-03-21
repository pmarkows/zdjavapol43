package com.sda.projekt43.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThemeController {

    @PostMapping("api/themes")
    ResponseEntity<String> addNewTheme(String themeName) {
        return ResponseEntity.ok("okok");
    }
}

