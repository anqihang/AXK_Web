package com.ax.axk.interceptor

import com.auth0.jwt.exceptions.TokenExpiredException
import com.ax.axk.utils.JwtUtil
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.stereotype.Component
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import java.lang.Exception

// 拦截器
@Component
class HttpInterceptor : HandlerInterceptor {
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        println("HttpInterceptor preHandle preHandle request:" + request.requestURI)
        val token = request.getHeader("Authorization");
        println("token:${token.slice(7 until token.length)}");
        if (token != null && token.isNotEmpty()) {
            try {
                val accountJWT = JwtUtil().validateToken(token.slice(7 until token.length));
            } catch (e: Exception) {
                response.writer.print(e.message)
                response.status = HttpServletResponse.SC_UNAUTHORIZED;//401 没有权限
//                response.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.message);
                return false;
            }
        } else {
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "no token");
            return false;
        }
        return super.preHandle(request, response, handler)
    }

    override fun postHandle(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        modelAndView: ModelAndView?
    ) {
        super.postHandle(request, response, handler, modelAndView)
    }

    override fun afterCompletion(
        request: HttpServletRequest,
        response: HttpServletResponse,
        handler: Any,
        ex: Exception?
    ) {
        super.afterCompletion(request, response, handler, ex)
    }


}