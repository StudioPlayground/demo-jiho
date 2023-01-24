package me.jiho.demo.common.exception;

public abstract class ServiceRuntimeException extends RuntimeException {

  public abstract String getMessageKey();

  public abstract String getDetailKey();

  public abstract ExceptionReason getReason();

  public record ExceptionReason(
      String className,
      Object[] values
  ) {

  }

}
