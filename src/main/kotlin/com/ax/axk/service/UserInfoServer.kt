package com.ax.axk.service

import com.ax.axk.dao.UserInfo
import com.ax.axk.mapper.UserInfoMapper
import com.ax.axk.service.impl.UserInfoServiceImpl
import org.springframework.stereotype.Service

@Service
class UserInfoServer(val userInfoMapper: UserInfoMapper) : UserInfoServiceImpl {
    override fun add(userInfo: UserInfo): Number {
        return 0;
    };
//    override fun get(id: Int): Array<UserInfo> {
//    };
    override fun edit(userInfo: UserInfo): Number {
        return 0;
    };
    override fun delete(id: Int): Number {
        return 0;
    };
    override fun remove(id: Int): Number {
        return 0;
    };
}