package com.bsm.domitory.domain.auth.admin.exception;

import com.bsm.domitory.global.exception.GlobalException;
import org.springframework.http.HttpStatus;

public class IsNotAdminException extends GlobalException {
    public IsNotAdminException() {
        super(HttpStatus.NOT_FOUND, "어드민 정보를 찾을 수 없습니다");
    }
}
