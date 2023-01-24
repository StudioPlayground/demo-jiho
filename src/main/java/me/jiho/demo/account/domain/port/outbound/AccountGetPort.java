package me.jiho.demo.account.domain.port.outbound;

import java.util.Optional;
import me.jiho.demo.account.domain.model.Account;

public interface AccountGetPort {

  Optional<Account> getAccount(Long id);
}
