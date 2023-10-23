package com.bsm.domitory.domain.dormitory.Repository;

import com.bsm.domitory.domain.dormitory.Entity.EnterLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterLogRepository extends JpaRepository<EnterLogEntity, Integer> {

}
