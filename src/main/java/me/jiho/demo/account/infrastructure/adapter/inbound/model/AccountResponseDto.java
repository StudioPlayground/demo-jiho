package me.jiho.demo.account.infrastructure.adapter.inbound.model;

import java.time.LocalDate;
import java.util.List;
import me.jiho.demo.account.domain.model.Account;

public record AccountResponseDto(Long id, String nickname, LocalDate birthDay, String gender,
                                 String profileImage, List<String> purpose) {

  public static AccountResponseDto from(Account account) {
    return new AccountResponseDto(account.getId(), account.getNickname(), account.getBirthDay(),
        account.getGender().name(), account.getProfileImage(), account.getPurpose());
  }
}