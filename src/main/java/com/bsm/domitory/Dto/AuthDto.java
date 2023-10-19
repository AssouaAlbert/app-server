package com.bsm.domitory.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthDto {
    @NotBlank
    private String userId;
    @NotBlank
    private String password;
}
