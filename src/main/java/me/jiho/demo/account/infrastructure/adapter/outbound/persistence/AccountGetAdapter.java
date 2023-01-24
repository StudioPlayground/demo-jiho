package me.jiho.demo.account.infrastructure.adapter.outbound.persistence;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.domain.model.Account;
import me.jiho.demo.account.domain.port.outbound.AccountGetPort;
import me.jiho.demo.account.infrastructure.adapter.outbound.model.AccountJpaModel;
import me.jiho.demo.account.infrastructure.adapter.outbound.persistence.repository.AccountRepository;
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
