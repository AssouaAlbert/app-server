package com.bsm.domitory.domain.auth.user.auth.Service;

import com.bsm.domitory.domain.auth.admin.Repository.AdminRepository;
import com.bsm.domitory.domain.auth.user.auth.presentation.Dto.request.SignUpRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final AdminRepository adminRepository;
    @Transactional
    public String adminLogin(SignUpRequestDto signUpRequestDto) {
        return null;
    }
}
