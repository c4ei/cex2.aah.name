package com.aah.exchange.service;

import com.aah.exchange.entity.User;
import com.aah.exchange.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * 사용자 관련 비즈니스 로직을 처리하는 서비스 클래스입니다.
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 이메일로 사용자를 조회합니다.
     * @param email 조회할 사용자의 이메일
     * @return Optional<User>
     */
    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    // 여기에 추가적인 사용자 관련 비즈니스 로직을 구현할 수 있습니다.
    // 예: 회원가입, 사용자 정보 수정, 탈퇴 등
}
