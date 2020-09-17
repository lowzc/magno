package com.magno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 控制台页面
 */
@Controller
public class ConsoleController {
    @GetMapping("/")
    public String login() {
        return "login";
    }
}
