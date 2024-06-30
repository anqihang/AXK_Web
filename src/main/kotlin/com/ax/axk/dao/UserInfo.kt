package com.ax.axk.dao
// 上下文序列化程序 只能在运行时找到类型的
import kotlinx.serialization.Contextual
// 序列化
import kotlinx.serialization.Serializable
import com.mybatisflex.annotation.Table
import com.mybatisflex.annotation.Id
import com.mybatisflex.annotation.KeyType

import lombok.Data
import java.util.*

@Serializable
@Data
@Table("user")
data class UserInfo(
    @Id(keyType = KeyType.Auto)
    val userId: Int,
    var userName: String,
    var userAge: UByte,
    var userSex: Byte,
    @Contextual val createTime: Date,
    @Contextual var updateTime: Date,
) {
}