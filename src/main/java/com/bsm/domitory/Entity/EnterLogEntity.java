package com.bsm.domitory.Entity;

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
    private int logId;
    private String userName;
    private Date enterDate;
    private int userNumber;
    private int roomNumber;
}
