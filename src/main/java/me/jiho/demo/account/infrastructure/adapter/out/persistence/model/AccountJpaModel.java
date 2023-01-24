package me.jiho.demo.account.infrastructure.adapter.out.persistence.model;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.jiho.demo.account.domain.aggregate.Account;
import me.jiho.demo.account.domain.aggregate.Account.Gender;

@Entity
@Table
@Getter
@AllArgsConstructor(access = PRIVATE)
@NoArgsConstructor(access = PROTECTED)
public class AccountJpaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nickname;
  private LocalDate birthDay;
  @Enumerated(value = EnumType.STRING)
  private Gender gender;
  private String profileImage;

  public static AccountJpaModel from(Account account) {
    return new AccountJpaModel(account.getId(), account.getNickname(), account.getBirthDay(),
        account.getGender(), account.getProfileImage());
  }

  public Account toDomainModel() {
    return Account.withId(id, nickname, birthDay, gender, profileImage, List.of());
  }
}
