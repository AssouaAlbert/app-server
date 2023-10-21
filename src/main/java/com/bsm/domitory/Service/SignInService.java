package com.bsm.domitory.Service;

import com.bsm.domitory.Provider.TokenProvider;
import com.bsm.domitory.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignInService {
    private final UserRepository userRepository;
    private final TokenProvider tokenProvider;

}
