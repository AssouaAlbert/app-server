package com.bsm.domitory.domain.dormitory.presentation.Dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReasonRequestDto {
    @NotBlank(message = "학생이름이 입력되지 않았습니다")
    private String userName;
    @NotBlank(message = "제목이 입력되지 않았습니다")
    private String title;
    @NotBlank(message = "내용이 입력되지 않았습니다" )
    private String content;
    @NotBlank(message = "방번호가 입력되지 않았습니다")
    private Long roomNumber;
    @NotBlank(message = "날짜가 입력되지 않았습니다")
    private Date enterDate;
}
