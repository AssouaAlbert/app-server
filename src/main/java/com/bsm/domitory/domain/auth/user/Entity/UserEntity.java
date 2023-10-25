package com.bsm.domitory.domain.auth.user.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "users")
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    private String userId;
    private String userName;
    private String userNumber;
    private String password;
    private Long roomNumber;
    private String accessToken;
    private String refreshToken;
}
