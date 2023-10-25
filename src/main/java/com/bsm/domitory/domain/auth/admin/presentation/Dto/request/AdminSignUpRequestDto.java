package com.bsm.domitory.domain.auth.admin.presentation.Dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminSignUpRequestDto {
    @NotBlank(message = "어드민 아이디가 입력되지 않았습니다")
    private String adminId;

    @NotBlank(message = "사감인지 숙장인지 작성해주세요")
    private String role;

    @NotBlank(message = "어드민 비밀번호가 입력되지 않았습니다")
    private String adminPassword;
}
