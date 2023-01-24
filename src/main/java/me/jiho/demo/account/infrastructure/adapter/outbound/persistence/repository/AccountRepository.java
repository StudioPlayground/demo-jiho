package me.jiho.demo.account.infrastructure.adapter.outbound.persistence.repository;

import me.jiho.demo.account.infrastructure.adapter.outbound.model.AccountJpaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountJpaModel, Long> {

}
