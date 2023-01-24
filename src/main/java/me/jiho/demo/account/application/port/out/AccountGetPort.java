package me.jiho.demo.account.application.port.out;

import java.util.Optional;
import me.jiho.demo.account.domain.aggregate.Account;

public interface AccountGetPort {

  Optional<Account> getAccount(Long id);
}
