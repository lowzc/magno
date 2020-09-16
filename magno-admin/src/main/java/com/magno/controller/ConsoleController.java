package com.magno.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 控制台页面
 */
//@Api("主页接口")
@Controller
public class ConsoleController {

    @GetMapping("/")
    public String loginUi() {
        return "/index";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
