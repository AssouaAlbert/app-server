package com.bsm.domitory.domain.auth.admin.presentation.Dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminTokenResponseDto {
    private String adminId;
    private String adminName;
    private String adminPassword;
    private String role;
}
