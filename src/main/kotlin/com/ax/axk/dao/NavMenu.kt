package com.ax.axk.dao

import com.mybatisflex.annotation.Id
import com.mybatisflex.annotation.KeyType
import com.mybatisflex.annotation.Table
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.LocalDateTime

// topNavMenu
@Table("tb_topNavMenu")
@Serializable
data class NavMenu(
    @Id(keyType = KeyType.Auto)
    val id: Int? = null,
    val title: String? = null,
    val path: String? = null,
    val type: String? = null,
    @Contextual val createTime: LocalDateTime? = null,
    @Contextual val updateTime: LocalDateTime? = null,
) {
}