package com.ax.axk.utils

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
// 全局异常处理拦截
@RestControllerAdvice
class GlobalException {
    @ExceptionHandler(Exception::class)
    fun handleMyException(e: Exception): String {
        println("异常捕获：${e}")
        return e.cause?.message ?: e.message ?: e.toString();
    }
}