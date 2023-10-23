package com.bsm.domitory.domain.dormitory.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder
@Entity(name = "reason")
@Table(name = "reason")
@NoArgsConstructor
@AllArgsConstructor
public class ReasonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reasonId;
    private String userName;
    private String title;
    private String content;
    private Long roomNuber;
    private Date enterDate;
}
