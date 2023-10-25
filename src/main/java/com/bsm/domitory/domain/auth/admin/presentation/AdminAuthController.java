package com.bsm.domitory.domain.auth.admin.presentation;

import com.bsm.domitory.domain.auth.admin.presentation.Dto.request.AdminSignInRequestDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminAuthController {
    @PostMapping("/admin/login")
    public String adminLogin(@RequestBody @Valid AdminSignInRequestDto adminSignInRequestDto) {
        return null;
    }
}
