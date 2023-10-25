package com.bsm.domitory.domain.auth.user.auth.exception;

import com.bsm.domitory.global.exception.GlobalException;
import org.springframework.http.HttpStatus;

public class PasswordIsNotMatchException extends GlobalException {

    public PasswordIsNotMatchException() {
        super(HttpStatus.BAD_REQUEST, "비밀번호가 틀립니다");
    }
}
