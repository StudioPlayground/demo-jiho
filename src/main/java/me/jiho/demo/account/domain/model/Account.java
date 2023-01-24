package me.jiho.demo.account.domain.model;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toUnmodifiableMap;
import static lombok.AccessLevel.PRIVATE;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = PRIVATE)
@Getter
public class Account {

  private final Long id;
  private final String nickname;
  private final LocalDate birthDay;
  private final Gender gender;
  private final String profileImage;
  private final List<String> purpose;

  public static Account withOutId(String nickname, LocalDate birthDay, Gender gender,
      String profileImage, List<String> purpose) {
    return new Account(null, nickname, birthDay, gender, profileImage, purpose);
  }

  public static Account withId(Long id, String nickname, LocalDate birthDay, Gender gender,
      String profileImage, List<String> purpose) {
    return new Account(id, nickname, birthDay, gender, profileImage, purpose);
  }

  public enum Gender {
    MALE, FEMALE;

    private static final Map<String, Gender> GENDER_MAP = stream(values()).collect(
        toUnmodifiableMap(Gender::name, gender -> gender));

    public static Gender from(String value) {
      return GENDER_MAP.get(value);
    }
  }

}
