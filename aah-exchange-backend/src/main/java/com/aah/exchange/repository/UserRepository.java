package com.aah.exchange.repository;

import com.aah.exchange.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 'users' 테이블에 대한 데이터 접근을 처리하는 리포지토리 인터페이스입니다.
 * Spring Data JPA를 사용하여 기본적인 CRUD 기능을 제공합니다.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * 이메일을 기준으로 사용자를 찾습니다.
     * @param email 사용자 이메일
     * @return Optional<User>
     */
    Optional<User> findByEmail(String email);
}
