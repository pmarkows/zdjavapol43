package com.sda.projekt43.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThemeController {

    @GetMapping("api/themes")
    String themesList() {
        return "test-123";
    }
}
