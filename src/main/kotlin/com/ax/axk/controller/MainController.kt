package com.ax.axk.controller

import com.ax.axk.utils.JwtUtil
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/main")
class MainController {
    @GetMapping
    fun hello(): String {
        return JwtUtil().extractToken("anqihng");
//        return "Hello World"
    }

    @PostMapping
    fun hello2(@RequestParam(value = "jwt", required = false) jwt: String): String {
        JwtUtil().validateToken(jwt);
        return ""
    }
}