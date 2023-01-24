package me.jiho.demo.account.application.port.out;

import me.jiho.demo.account.domain.aggregate.Account;

public interface AccountCreatePort {

  Account createAccount(Account account);

}
