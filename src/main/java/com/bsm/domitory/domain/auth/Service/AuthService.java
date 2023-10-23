package com.bsm.domitory.domain.auth.Service;

import com.bsm.domitory.domain.auth.Repository.UserRepository;
import com.bsm.domitory.domain.auth.presentation.Dto.Users.SignUpRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    @Transactional
    public String login(SignUpRequestDto signUpRequestDto) {
        return null;
    }
}
