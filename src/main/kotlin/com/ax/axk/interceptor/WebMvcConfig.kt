package com.ax.axk.interceptor

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
// 拦截器配置
@Configuration
class WebMvcConfig : WebMvcConfigurer {
    // 配置自定义拦截器
    override fun addInterceptors(registry: InterceptorRegistry) {
        val addPathPatterns = registry.addInterceptor(HttpInterceptor()).addPathPatterns("/**");
    }

}