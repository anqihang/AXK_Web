package com.ax.axk.controller

import com.ax.axk.dao.NavMenu
import com.ax.axk.service.NavMenuServer
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/navMenu")
class NavMenuController(private val navMenuServer: NavMenuServer) {
    @PostMapping
    fun insetNavMenu(@RequestBody navMenu: NavMenu) {

    }

    @GetMapping
    fun getNavMenu(
        @RequestParam(value = "id", required = false) id: Int?,
        @RequestParam(value = "type", required = false) type: String?
    ): Any {

        val navMenuList = navMenuServer.get(id, type);
        return if (id != null) navMenuList[0] else navMenuList
    }

    @PatchMapping
    fun updatePatch(@RequestBody navMenu: NavMenu) {
    }

    @PutMapping
    fun updatePut(@RequestBody navMenu: NavMenu) {
    }

    @DeleteMapping
    fun deleteNavMenu(@RequestParam(value = "id", required = true) id: Int) {
    }

}