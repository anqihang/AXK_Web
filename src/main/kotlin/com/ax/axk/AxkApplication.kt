package com.ax.axk

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.ax.axk.mapper")
class AxkApplication

fun main(args: Array<String>) {
	System.setProperty("spring.devtools.restart.enabled", "false");
	runApplication<AxkApplication>(*args)
}
