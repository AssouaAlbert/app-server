package com.bsm.domitory.domain.auth.user.presentation;

import com.bsm.domitory.domain.auth.user.presentation.Dto.request.SignUpRequestDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @PostMapping("/login")
    public String login(@RequestBody @Valid SignUpRequestDto signInRequestDto) {
        return null;
    }
}
