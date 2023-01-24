package me.jiho.demo.account.domain.port.inbound;

import me.jiho.demo.account.application.model.AccountCreateCommand;
import me.jiho.demo.account.domain.model.Account;

public interface AccountCreateUseCase {
  Account createAccount(AccountCreateCommand command);
}
