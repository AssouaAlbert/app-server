package com.bsm.domitory.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRespoinseDto {
    private String token;
    private int expiredTime;
}
