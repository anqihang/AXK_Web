package com.ax.axk.mapper

import com.ax.axk.dao.UserInfo
import com.mybatisflex.core.BaseMapper
import org.springframework.web.bind.annotation.Mapping

interface UserInfoMapper : BaseMapper<UserInfo> {
    fun inset();
    fun find();
    fun edit();
    fun delete();
}