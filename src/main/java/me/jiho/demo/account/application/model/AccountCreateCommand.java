package me.jiho.demo.account.application.model;

import java.time.LocalDate;
import java.util.List;
import me.jiho.demo.account.domain.model.Account;
import me.jiho.demo.account.domain.model.Account.Gender;

public record AccountCreateCommand(String nickname, LocalDate birthDay, String gender,
                                   String profileImage, List<String> purpose) {

  public Account toDomainModel() {
    return Account.withOutId(nickname, birthDay, Gender.from(gender), profileImage, purpose);
  }

}
