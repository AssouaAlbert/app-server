package com.bsm.domitory.domain.auth.user.exception;

import com.bsm.domitory.global.exception.GlobalException;
import org.springframework.http.HttpStatus;

public class UserAlreadyExistsException extends GlobalException {

    public UserAlreadyExistsException() {
        super(HttpStatus.CONFLICT, "이미 존재하는 사용자입니다");
    }
}
