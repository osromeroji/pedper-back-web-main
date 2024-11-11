package com.mercadona.pedper.main.driven.repositories;

import com.mercadona.pedper.main.driven.repositories.models.VacancyMO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacancyMOJpaRepository extends JpaRepository<VacancyMO, Long> {
}
