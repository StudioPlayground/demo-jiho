package me.jiho.demo.account.infrastructure.adapter.inbound.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import me.jiho.demo.account.application.model.AccountCreateCommand;
import org.hibernate.validator.constraints.Length;

public record AccountCreateRequestDto(@NotNull @Length(max = 30) String nickname,
                                      @NotNull LocalDate birthDay, @NotNull String gender,
                                      String profileImage, @NotEmpty List<String> purpose) {

  public AccountCreateCommand toCommand() {
    return new AccountCreateCommand(nickname, birthDay, gender, profileImage, purpose);
  }

}
