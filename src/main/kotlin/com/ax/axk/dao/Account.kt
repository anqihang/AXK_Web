package com.ax.axk.dao

import com.fasterxml.jackson.annotation.JsonIgnore
import com.mybatisflex.annotation.Id
import com.mybatisflex.annotation.KeyType
import com.mybatisflex.annotation.Table
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable
import java.time.LocalDateTime

@Table("tb_account")
@Serializable
//@JsonInclude(JsonInclude.Include.NON_NULL)//不返回null
data class Account(
    @Id(keyType = KeyType.Auto)//主键自增
    var id: Int? = null,
    var nickName: String? = null,
    var username: String? = null,
    @JsonIgnore//不返回的字段
    var password: String? = null,
    var email: String? = null,
    var phone: String? = null,
    var age: Byte? = null,
    var sex: Byte? = null,
    var isDelete: Boolean? = null,
    @Contextual var createTime: LocalDateTime? = null,
    @Contextual var updateTime: LocalDateTime? = null,
) {
}