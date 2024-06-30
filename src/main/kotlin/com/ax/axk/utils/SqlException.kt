package com.ax.axk.utils

/**
 * @exception 把错误信息转换成消息
 */
class SqlException(private val message: String?) {
    //
    private val isDuplicate = message?.let { Regex("Duplicate").matches(it) };
    fun getSqlDescription(): String {
        println(message);
        if(isDuplicate == true){
            return "重复"
        }
        return ""
    }

}