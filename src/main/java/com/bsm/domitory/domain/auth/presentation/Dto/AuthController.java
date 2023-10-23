package com.bsm.domitory.domain.auth.presentation.Dto;

import com.bsm.domitory.domain.auth.presentation.Dto.Users.SignInRequestDto;
import com.bsm.domitory.domain.auth.Entity.UserEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @PostMapping("/login")
    public UserEntity login(@RequestBody @Valid SignInRequestDto dto) {
        return null;
    }
}
