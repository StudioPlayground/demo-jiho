package me.jiho.demo.account.domain.port.inbound;

import me.jiho.demo.account.domain.model.Account;

public interface AccountGetUseCase {

  Account getAccount(Long id);

}
