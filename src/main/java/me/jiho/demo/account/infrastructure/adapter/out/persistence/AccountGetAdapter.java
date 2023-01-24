package me.jiho.demo.account.infrastructure.adapter.out.persistence;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.domain.aggregate.Account;
import me.jiho.demo.account.application.port.out.AccountGetPort;
import me.jiho.demo.account.infrastructure.adapter.out.persistence.model.AccountJpaModel;
import me.jiho.demo.account.infrastructure.adapter.out.persistence.repository.AccountRepository;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AccountGetAdapter implements AccountGetPort {

  private final AccountRepository accountRepository;


  @Override
  public Optional<Account> getAccount(Long id) {
    return accountRepository.findById(id).map(AccountJpaModel::toDomainModel);
  }
}
