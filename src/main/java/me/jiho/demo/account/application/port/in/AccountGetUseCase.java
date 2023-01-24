package me.jiho.demo.account.application.port.in;

import me.jiho.demo.account.domain.aggregate.Account;

public interface AccountGetUseCase {

  Account getAccount(Long id);

}
