package com.ax.axk

import com.ax.axk.dao.Account
import com.ax.axk.dao.UserInfo
import com.ax.axk.mapper.AccountMapper
import com.ax.axk.mapper.UserInfoMapper
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AxkApplicationTests {

	@Autowired
	private lateinit var accountMapper: AccountMapper

	@Autowired
	private lateinit var userInfoMapper: UserInfoMapper

	@Test
	fun contextLoads() {
//		val userList: MutableList<UserInfo>? = userInfoMapper.selectAll();
//		println(userList)
//	 accountMapper.selectOneById(1);
//		val account = accountMapper.selectOneById(1);
		val account = accountMapper.selectAll();
		println(account.toString());
	}

}
