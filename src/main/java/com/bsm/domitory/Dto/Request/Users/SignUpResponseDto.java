package com.bsm.domitory.Dto.Request.Users;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpResponseDto {
    @NotBlank(message = "아이디가 입력되지 않았습니다")
    private String userId;
    @NotBlank(message = "비밀번호가 입력되지 않았습니다")
    private String userPassword;
}
