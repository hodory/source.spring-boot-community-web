package com.khzero.springboot.controller;

import annotation.SocialUser;
import com.khzero.springboot.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // 인증 성공 후 리다이렉트 되는 경로
    @GetMapping(value = "/loginSuccess")
    public String loginComplete(@SocialUser User user) {
        return "redirect:/board/list";
    }

}
