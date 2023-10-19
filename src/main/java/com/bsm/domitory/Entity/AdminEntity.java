package com.bsm.domitory.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "admin")
@Table(name = "admin")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminEntity {
    @Id
    private String adminId;
    private String adminName;
    private String adminPassword;
    private String accessToken;
    private String refreshToken;
}
