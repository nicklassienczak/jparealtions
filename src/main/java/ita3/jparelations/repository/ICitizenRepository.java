package ita3.jparelations.repository;

import ita3.jparelations.entity.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICitizenRepository extends JpaRepository<Citizen, Long> {
}
