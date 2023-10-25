package com.bsm.domitory.domain.dormitory.presentation;

import com.bsm.domitory.domain.dormitory.Entity.ReasonEntity;
import com.bsm.domitory.domain.dormitory.presentation.Dto.ReasonRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CannotEntryWriteController {
    // 입사 불가 이유 작성 API
    @PostMapping("/not/entry/reason/write")
    public ReasonEntity reasonWrite(@RequestBody ReasonRequestDto reasonRequestDto) {
        return null;
    }
}
