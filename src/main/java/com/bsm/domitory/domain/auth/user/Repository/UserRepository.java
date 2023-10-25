package com.bsm.domitory.domain.auth.user.Repository;

import com.bsm.domitory.domain.auth.user.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

}
