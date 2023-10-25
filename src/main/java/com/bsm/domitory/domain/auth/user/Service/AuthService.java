package com.bsm.domitory.domain.auth.user.Service;

import com.bsm.domitory.domain.auth.admin.Repository.AdminRepository;
import com.bsm.domitory.domain.auth.user.presentation.Dto.request.SignInRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AdminRepository adminRepository;
    @Transactional
    public String adminLogin(SignInRequestDto signUpRequestDto) {
        return null;
    }
}
