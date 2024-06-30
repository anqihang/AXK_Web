package com.ax.axk.service

import com.ax.axk.dao.NavMenu
import com.ax.axk.mapper.NavMenuMapper
import com.ax.axk.service.impl.NavMenuServiceImpl
import com.mybatisflex.kotlin.extensions.db.query
import com.mybatisflex.kotlin.extensions.kproperty.ge
import com.mybatisflex.kotlin.extensions.wrapper.whereWith
import org.springframework.stereotype.Service

@Service
class NavMenuServer(private val navMenuMapper: NavMenuMapper) : NavMenuServiceImpl {
    override fun add(navMenu: NavMenu): Int {
        val line = navMenuMapper.insertSelective(navMenu);
        println("insert $line / ${navMenu.toString()},accountServer");
        return line;
    }

    override fun get(id: Int?,type:String?): List<NavMenu> {
        if (id != null) {
            val navMenus: List<NavMenu> = query {
                select(
                    NavMenu::id,
                    NavMenu::title,
                    NavMenu::path,
                )
                whereWith { NavMenu::id ge id }
            }
            return navMenus;
        }
        val navMenus = navMenuMapper.selectAll();
        return navMenus;
    }

    override fun edit(navMenu: NavMenu): Int {
        TODO("Not yet implemented")
    }

    override fun delete(id: Int): Int {
        TODO("Not yet implemented")
    }
}