package com.ax.axk.utils

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.auth0.jwt.interfaces.DecodedJWT
import java.util.*

class JwtUtil {
    private val secret = "ax2000";
    private val expiration: Int = 3600 * 24 * 7;
    private val algorithm: Algorithm = Algorithm.HMAC256(secret);

    // 验证
    fun validateToken(token: String): DecodedJWT {
        val jwt = JWT.require(algorithm)
            .acceptLeeway(1)
            .build()
            .verify(token)
        return jwt;
    }

    // 生成
    fun extractToken(username: String): String {
        val jwt = JWT.create()
            .withClaim("username", username)
            .withExpiresAt(Date(System.currentTimeMillis() + expiration))// 过期时间
            .sign(algorithm);
        return jwt;
    }
}