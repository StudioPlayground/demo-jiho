package me.jiho.demo.account.application.port.in;

import me.jiho.demo.account.application.port.in.model.AccountCreateCommand;
import me.jiho.demo.account.domain.aggregate.Account;

public interface AccountCreateUseCase {
  Account createAccount(AccountCreateCommand command);
}
