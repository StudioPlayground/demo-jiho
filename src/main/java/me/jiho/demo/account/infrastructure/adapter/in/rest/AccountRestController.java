package me.jiho.demo.account.infrastructure.adapter.in.rest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import me.jiho.demo.account.application.port.in.model.AccountCreateCommand;
import me.jiho.demo.account.application.port.in.AccountCreateUseCase;
import me.jiho.demo.account.application.port.in.AccountGetUseCase;
import me.jiho.demo.account.infrastructure.adapter.in.rest.model.AccountCreateRequestDto;
import me.jiho.demo.account.infrastructure.adapter.in.rest.model.AccountResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AccountRestController {

  private final AccountCreateUseCase accountCreateUseCase;

  private final AccountGetUseCase accountGetUseCase;

  @PostMapping("/accounts")
  AccountResponseDto createAccount(@Valid @RequestBody AccountCreateRequestDto createRequestDto) {
    AccountCreateCommand command = createRequestDto.toCommand();
    final var account = accountCreateUseCase.createAccount(command);
    return AccountResponseDto.from(account);
  }

  @GetMapping("/accounts/{id}")
  AccountResponseDto getAccount(@PathVariable Long id) {
    final var account = accountGetUseCase.getAccount(id);
    return AccountResponseDto.from(account);
  }
}
