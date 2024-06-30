package com.ax.axk.mapper

import com.ax.axk.dao.UserInfo
import com.mybatisflex.core.BaseMapper

interface MainMapper: BaseMapper<UserInfo> {
    fun inset();//post
    fun find();//get
    fun edit();//put
    fun delete();//delete
}