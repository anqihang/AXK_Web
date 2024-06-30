package com.ax.axk.service.impl

import com.ax.axk.dao.NavMenu

interface NavMenuServiceImpl {
    // 添加导航菜单
    fun add(navMenu: NavMenu): Int;

    // 查询导航菜单
    fun get(id: Int?, type: String?): List<NavMenu>;

    // 编辑导航菜单
    fun edit(navMenu: NavMenu): Int;

    // 删除导航菜单
    fun delete(id: Int): Int;
}