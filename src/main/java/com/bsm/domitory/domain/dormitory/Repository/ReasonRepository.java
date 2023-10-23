package com.bsm.domitory.domain.dormitory.Repository;

import com.bsm.domitory.domain.dormitory.Entity.ReasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReasonRepository extends JpaRepository<ReasonEntity, Integer> {
}
