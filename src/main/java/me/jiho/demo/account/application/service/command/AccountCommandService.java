package me.jiho.demo.account.application.service.command;

import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.application.port.in.model.AccountCreateCommand;
import me.jiho.demo.account.application.port.in.AccountCreateUseCase;
import me.jiho.demo.account.domain.aggregate.Account;
import me.jiho.demo.account.application.port.out.AccountCreatePort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AccountCommandService implements AccountCreateUseCase {

  private final AccountCreatePort accountCreatePort;


  @Override
  public Account createAccount(AccountCreateCommand command) {
    return accountCreatePort.createAccount(command.toDomainModel());
  }
}
