package com.bsm.domitory.domain.auth.admin.Repository;

import com.bsm.domitory.domain.auth.admin.Entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, String> {

}
