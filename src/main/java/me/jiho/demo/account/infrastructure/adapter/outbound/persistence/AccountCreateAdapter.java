package me.jiho.demo.account.infrastructure.adapter.outbound.persistence;

import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.domain.model.Account;
import me.jiho.demo.account.domain.port.outbound.AccountCreatePort;
import me.jiho.demo.account.infrastructure.adapter.outbound.model.AccountJpaModel;
import me.jiho.demo.account.infrastructure.adapter.outbound.persistence.repository.AccountRepository;
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
