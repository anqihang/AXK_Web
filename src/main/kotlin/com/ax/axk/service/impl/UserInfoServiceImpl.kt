package com.ax.axk.service.impl

import com.ax.axk.dao.UserInfo

interface UserInfoServiceImpl {
    fun add(userInfo: UserInfo): Number;
//    fun get(id: Int): Array<UserInfo>;
    fun edit(userInfo: UserInfo): Number;
    fun delete(id: Int): Number;

    //    假删除
    fun remove(id: Int): Number;
}