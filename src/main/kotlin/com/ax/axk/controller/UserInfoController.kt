package com.ax.axk.controller

import com.ax.axk.dao.UserInfo
import com.ax.axk.service.UserInfoServer
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserInfoController(val userInfoServer: UserInfoServer) {
//    @PostMapping
//    fun insetUser(@RequestBody userInfo: UserInfo): String {
//        val type = userInfoServer.add(userInfo);
//        return if (type == 0) "添加失败" else "添加成功";
//    }
//
//    @GetMapping("/")
//    fun getUserList() {
////        val userList:UserInfo[] = userInfoServer.get();
//    }
}