package com.khzero.springboot.controller;

import annotation.SocialUser;
import com.khzero.springboot.domain.User;
import com.khzero.springboot.domain.enums.SocialType;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

//    // 인증 성공 후 리다이렉트 되는 경로
//    @GetMapping(value = "/{facebook|google|kakao}/complete")
//    public String loginComplete(HttpSession session) {
//        // 기본적인 인증 정보 뿐 아니라 OAuth2 인증과 관련된 정보도 함께 제공됨.
//        OAuth2Authentication authentication = (OAuth2Authentication) SecurityContextHolder.getContext().getAuthentication();
//        SecurityContextHolder.getContext().getAuthentication();
//        Map<String, String> map = (HashMap<String, String>) authentication.getUserAuthentication().getDetails();
//        session.setAttribute("user", User.builder()
//                .name(map.get("name"))
//                .email(map.get("email"))
//                .principal(map.get("id"))
//                .socialType(SocialType.FACEBOOK)
//                .createdDate(LocalDateTime.now())
//                .build()
//        );
//        return "redirect:/board/list";
//    }

    // 인증 성공 후 리다이렉트 되는 경로
    @GetMapping(value = "/{facebook|google|kakao}/complete")
    public String loginComplete(@SocialUser User user) {
        return "redirect:/board/list";
    }

}
