package com.bsm.domitory.domain.dormitory.presentation;

import com.bsm.domitory.domain.dormitory.Entity.ReasonEntity;
import com.bsm.domitory.domain.dormitory.presentation.Dto.ReasonRequestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DormitoryController {
    @PostMapping("/write/reason")
    public ReasonEntity reasonWrite(@RequestBody ReasonRequestDto dto) {
        return null;
    }
}
