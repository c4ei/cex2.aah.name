package com.aah.exchange.repository;

import com.aah.exchange.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 'cex_orders' 테이블에 대한 데이터 접근을 처리하는 리포지토리 인터페이스입니다.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    /**
     * 특정 사용자의 모든 주문을 찾습니다.
     * @param userId 사용자 ID
     * @return 주문 목록
     */
    List<Order> findByUserId(Integer userId);

    /**
     * 특정 거래 쌍의 모든 주문을 찾습니다.
     * @param pair 거래 쌍
     * @return 주문 목록
     */
    List<Order> findByPair(String pair);
}
