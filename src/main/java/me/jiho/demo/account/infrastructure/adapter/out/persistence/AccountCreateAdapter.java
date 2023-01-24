package me.jiho.demo.account.infrastructure.adapter.out.persistence;

import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.domain.aggregate.Account;
import me.jiho.demo.account.application.port.out.AccountCreatePort;
import me.jiho.demo.account.infrastructure.adapter.out.persistence.model.AccountJpaModel;
import me.jiho.demo.account.infrastructure.adapter.out.persistence.repository.AccountRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountCreateAdapter implements AccountCreatePort {

  private final AccountRepository accountRepository;


  @Override
  public Account createAccount(Account account) {
    final var accountJpaModel = AccountJpaModel.from(account);
    return accountRepository.save(accountJpaModel).toDomainModel();
  }
}
