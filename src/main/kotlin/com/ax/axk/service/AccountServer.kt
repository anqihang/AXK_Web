package com.ax.axk.service

import com.ax.axk.dao.Account
import com.ax.axk.mapper.AccountMapper
import com.ax.axk.service.impl.AccountServiceImpl
import com.mybatisflex.core.util.UpdateEntity
import com.mybatisflex.kotlin.extensions.db.query
import com.mybatisflex.kotlin.extensions.kproperty.ge
import com.mybatisflex.kotlin.extensions.wrapper.whereWith
import org.springframework.stereotype.Service

@Service
class AccountServer(private val accountMapper: AccountMapper) : AccountServiceImpl {
    override fun add(account: Account): Int {
        // 1 添加一行
        val line = accountMapper.insertSelective(account);
        println("insert $line / ${account.toString()},accountServer");
        return line;
    }


    override fun getAccounts(id: Int?): List<Account> {
        if (id != null) {
            // 单个查询
            val account: List<Account> = query {
                select(
                    Account::id,
                    Account::nickName,
                    Account::username,
                    Account::age,
                    Account::sex,
                )
                whereWith { Account::id ge id }
            }
            return account;
        }
        // 列表查询
        val accounts = accountMapper.selectAll();
        return accounts;
    }

    override fun edit(account: Account, type: String): Int {
        var line = 0;
        if (type == "patch") {
            val newAccount: Account = UpdateEntity.of(Account::class.java, account.id);
            accountMapper.update(newAccount);
            line = 1;
        } else if (type == "put") {
            line = accountMapper.update(account, true);
        }
        println("update-$type $line / ${account.toString()},accountServer");
        return line;
    }

    override fun delete(id: Int): Int {
        val account: Account = UpdateEntity.of(Account::class.java, id);
        val line = accountMapper.update(account);
        println("delete  / $id,accountServer");
        return line;
    }
}

