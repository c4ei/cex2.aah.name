package com.aah.exchange.repository;

import com.aah.exchange.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * 'cex_coins' 테이블에 대한 데이터 접근을 처리하는 리포지토리 인터페이스입니다.
 */
@Repository
public interface CoinRepository extends JpaRepository<Coin, Integer> {

    /**
     * 코인 심볼과 네트워크를 기준으로 코인 정보를 찾습니다.
     * @param symbol 코인 심볼
     * @param network 네트워크
     * @return Optional<Coin>
     */
    Optional<Coin> findBySymbolAndNetwork(String symbol, String network);
}
