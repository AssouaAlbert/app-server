package com.bsm.domitory.Dto.Admin;

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
    @NotBlank(message = "어드민 비밀번호가 입력되지 않았습니다")
    private String adminPassword;
}
