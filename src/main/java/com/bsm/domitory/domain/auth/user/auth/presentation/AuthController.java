package com.bsm.domitory.domain.auth.user.auth.presentation;

import com.bsm.domitory.domain.auth.user.auth.presentation.Dto.request.SignInRequestDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestBody @Valid SignInRequestDto signInRequestDto) {
        return null;
    }
}
