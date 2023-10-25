package com.bsm.domitory.domain.auth.user.auth.exception;

import com.bsm.domitory.global.exception.GlobalException;
import org.springframework.http.HttpStatus;

public class UserNotFoundException extends GlobalException {

    public UserNotFoundException() {
        super(HttpStatus.NOT_FOUND, "사용자를 찾을 수 없습니다");
    }
}
