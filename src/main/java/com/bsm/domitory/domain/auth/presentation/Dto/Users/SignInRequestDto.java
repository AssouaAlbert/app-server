package com.bsm.domitory.domain.auth.presentation.Dto.Users;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInRequestDto {
    @NotBlank(message = "아이디가 입력되지 않았습니다")
    private String userId;
    @NotBlank(message = "이름이 입력되지 않았습니다")
    private String userName;
    @NotBlank(message = "학번이 입력되지 않았습니다")
    private Integer userNumber;
    @NotBlank(message = "비밀번호가 입력되지 않았습니다")
    private String password;
    @NotBlank(message = "기숙사 방번호가 입력되지 않았습니다")
    private Integer roomNumber;
}
