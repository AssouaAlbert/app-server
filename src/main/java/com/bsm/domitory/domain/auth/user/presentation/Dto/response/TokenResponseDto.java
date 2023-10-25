package com.bsm.domitory.domain.auth.user.presentation.Dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TokenResponseDto {
    private String userId;
    private String userName;
    private Long userNumber;
    private String userPassword;
    private Long roomNumber;
}
