package me.jiho.demo.common.exception;

import static lombok.AccessLevel.PRIVATE;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = PRIVATE)
public class NotFoundException extends ServiceRuntimeException {

  static final String MESSAGE_KEY = "error.notfound";
  static final String MESSAGE_DETAILS = "error.notfound.details";

  private final ExceptionReason reason;

  public static NotFoundException of(Class<?> clazz, Object... values) {
    return of(clazz.getSimpleName(), values);
  }

  public static NotFoundException of(String targetName, Object... values) {
    final var reason = new ExceptionReason(targetName, values);
    return new NotFoundException(reason);
  }

  @Override
  public String getMessageKey() {
    return MESSAGE_KEY;
  }

  @Override
  public String getDetailKey() {
    return MESSAGE_DETAILS;
  }
}
