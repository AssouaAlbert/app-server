package com.bsm.domitory.Entity;

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
    private int reasonId;
    private String userName;
    private String title;
    private String content;
    private int roomNuber;
    private Date enterDate;
}
