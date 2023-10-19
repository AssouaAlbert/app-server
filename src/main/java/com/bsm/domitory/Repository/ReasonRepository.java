package com.bsm.domitory.Repository;

import com.bsm.domitory.Entity.ReasonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReasonRepository extends JpaRepository<ReasonEntity, Integer> {
}
