package com.bsm.domitory.domain.dormitory.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "enterLog")
@Table(name = "enterLog")
public class EnterLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long logId;
    private String userName;
    private Date enterDate;
    private Integer userNumber;
    private Long roomNumber;
}
