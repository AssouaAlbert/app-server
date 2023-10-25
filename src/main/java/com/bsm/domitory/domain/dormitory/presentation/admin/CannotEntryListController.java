package com.bsm.domitory.domain.dormitory.presentation.admin;

import com.bsm.domitory.domain.dormitory.Entity.ReasonEntity;
import com.bsm.domitory.domain.dormitory.Repository.ReasonRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CannotEntryListController {
    private final ReasonRepository reasonRepository;

    public CannotEntryListController(ReasonRepository reasonRepository) {
        this.reasonRepository = reasonRepository;
    }

    // 기숙사 입사하지 않은 모든 학생의 입사불가 이유 조회
    @GetMapping("/not/entry/reason/list")
    public List<ReasonEntity> reasonLog() {
        return reasonRepository.findAll(); // 모든 데이터 조회
    }
}
