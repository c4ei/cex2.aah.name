package com.aah.exchange.repository;

import com.aah.exchange.entity.Balance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 'cex_balan' 테이블에 대한 데이터 접근을 처리하는 리포지토리 인터페이스입니다.
 */
@Repository
public interface BalanceRepository extends JpaRepository<Balance, Integer> {

    /**
     * 특정 사용자의 모든 자산 정보를 찾습니다.
     * @param userId 사용자 ID
     * @return 자산 목록
     */
    List<Balance> findByUserId(Integer userId);

    /**
     * 특정 사용자의 특정 코인에 대한 자산 정보를 찾습니다.
     * @param userId 사용자 ID
     * @param coinSymbol 코인 심볼
     * @return Optional<Balance>
     */
    Optional<Balance> findByUserIdAndCoinSymbol(Integer userId, String coinSymbol);
}
