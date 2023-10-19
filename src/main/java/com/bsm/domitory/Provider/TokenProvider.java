package com.bsm.domitory.Provider;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TokenProvider {
    private static final String SECURITY_KEY = "dormitoryJwt-secret!@";

    public String createJwt(String userId) {
        Date exprTime = Date.from(Instant.now().plus(1, ChronoUnit.HOURS));
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS512, SECURITY_KEY)
                .setSubject(userId)
                .setIssuedAt(new Date())
                .setExpiration(exprTime)
                .compact();
    }
}
