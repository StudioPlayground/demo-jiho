package me.jiho.demo.account.infrastructure.adapter.out.persistence.repository;

import me.jiho.demo.account.infrastructure.adapter.out.persistence.model.AccountJpaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountJpaModel, Long> {

}
