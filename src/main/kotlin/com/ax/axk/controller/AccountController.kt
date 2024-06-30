package com.ax.axk.controller

import com.ax.axk.dao.Account
import com.ax.axk.service.AccountServer
import com.ax.axk.utils.JwtUtil
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/accounts")
class AccountController(private val accountServer: AccountServer, server: AccountServer) {
    @PostMapping
    fun insertAccount(@RequestBody account: Account): String {
        val status = accountServer.add(account);
        return if (status == 0) "添加失败" else "添加成功";
    }

    @GetMapping
    fun getAccount(@RequestParam(value = "id", required = false) id: Int?): Any {
        val accounts = accountServer.getAccounts(id);
        return if (id != null) accounts[0] else accounts;
    }

    @PatchMapping
    fun updatePatch(@RequestBody account: Account): String {
        val status = accountServer.edit(account, "patch");
        return if (status == 0) "修改失败" else "修改成功"
    }

    @PutMapping
    fun updatePut(@RequestBody account: Account): String {
        val status = accountServer.edit(account, "put");
        return if (status == 0) "修改失败" else "修改成功";
    }

    @DeleteMapping
    fun deleteAccount(@RequestParam(value = "id", required = true) id: Int): String {
        val status = accountServer.delete(id);
        return if (status == 0) "删除失败" else "删除成功";
    }
}