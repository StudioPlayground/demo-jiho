package me.jiho.demo.account.application.port.in.model;

import java.time.LocalDate;
import java.util.List;
import me.jiho.demo.account.domain.aggregate.Account;
import me.jiho.demo.account.domain.aggregate.Account.Gender;

public record AccountCreateCommand(String nickname, LocalDate birthDay, String gender,
                                   String profileImage, List<String> purpose) {

  public Account toDomainModel() {
    return Account.withOutId(nickname, birthDay, Gender.from(gender), profileImage, purpose);
  }

}
