package me.jiho.demo.account.application.service.command;

import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.application.model.AccountCreateCommand;
import me.jiho.demo.account.domain.port.inbound.AccountCreateUseCase;
import me.jiho.demo.account.domain.model.Account;
import me.jiho.demo.account.domain.port.outbound.AccountCreatePort;
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
