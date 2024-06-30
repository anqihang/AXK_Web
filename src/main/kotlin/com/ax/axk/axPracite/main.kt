package com.ax.axk.axPracite

import com.ax.axk.utils.JwtUtil


fun main(args: Array<String>) {
    val lists = listOf(100000);
    val sets = setOf(100000);
    val maps = mapOf(1 to 100);
    val time = System.currentTimeMillis();
    val jwt = JwtUtil().extractToken("anqi");
}
fun ver(jwt:String){
    val re = JwtUtil().validateToken(jwt);
}
