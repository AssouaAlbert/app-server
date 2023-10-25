package com.bsm.domitory.domain.auth.admin.presentation.Dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminSignInRequestDto {
    @NotBlank(message = "어드민 아이디가 입력되지 않았습니다")
    private String adminId;
    @NotBlank(message = "어드민 이름이 입력되지 않았습니다")
    private String adminName;
    @NotBlank(message = "어드민 비밀번호가 입력되지 않았습니다")
    private String adminPassword;
}
