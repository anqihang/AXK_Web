package com.ax.axk.service.impl

import com.ax.axk.dao.Account

interface AccountServiceImpl {
    // 添加账号
    fun add(account: Account): Int;

    // 查询账号list
    fun getAccounts(id: Int?): List<Account>;

    // 修改账号信息
    fun edit(account: Account, type: String): Int;

    // 删除账号 - 先逻辑删除，30天后彻底删除
    fun delete(id: Int): Int;
}