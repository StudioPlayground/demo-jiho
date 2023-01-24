package me.jiho.demo.account.domain.port.outbound;

import me.jiho.demo.account.domain.model.Account;

public interface AccountCreatePort {

  Account createAccount(Account account);

}
