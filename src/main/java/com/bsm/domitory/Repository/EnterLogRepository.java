package com.bsm.domitory.Repository;

import com.bsm.domitory.Entity.EnterLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterLogRepository extends JpaRepository<EnterLogEntity, Integer> {
}
