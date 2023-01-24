package me.jiho.demo.account.application.service.query;

import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.domain.model.Account;
import me.jiho.demo.account.domain.port.inbound.AccountGetUseCase;
import me.jiho.demo.account.domain.port.outbound.AccountGetPort;
import me.jiho.demo.common.exception.NotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class AccountQueryService implements AccountGetUseCase {

  private final AccountGetPort accountGetPort;

  @Override
  public Account getAccount(Long id) {
    return accountGetPort.getAccount(id)
        .orElseThrow(() -> NotFoundException.of(Account.class, id));
  }
}
