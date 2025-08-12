package com.aah.exchange.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 'cex_orders' 테이블과 매핑되는 엔티티 클래스입니다.
 * 사용자 주문 정보를 나타냅니다.
 */
@Data
@Entity
@Table(name = "cex_orders")
public class Order {

    /**
     * 주문 고유 ID (기본 키)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 사용자 ID
     */
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    /**
     * 거래 쌍 (예: AAH/ETH, SOL/USDC)
     */
    @Column(nullable = false, length = 50)
    private String pair;

    /**
     * 주문 타입: 구매(buy), 판매(sell)
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "enum('buy','sell','trade_buy_cancel','trade_sell_cancel')")
    private OrderType type;

    /**
     * 주문 가격
     */
    @Column(nullable = false, precision = 20, scale = 8)
    private BigDecimal price;

    /**
     * 주문 수량
     */
    @Column(nullable = false, precision = 20, scale = 8)
    private BigDecimal amount;

    /**
     * 체결된 수량
     */
    @Column(name = "filled_amount", precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal filledAmount;

    /**
     * 주문 상태: 오픈(open), 완료(filled), 부분 완료(partial_filled), 취소(cancelled) 등
     */
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, columnDefinition = "enum('open','filled','partial_filled','cancelled','trade_buy_cancel','trade_sell_cancel')")
    private OrderStatus status;

    /**
     * 생성일시
     */
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    /**
     * 수정일시
     */
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    public enum OrderType {
        buy, sell, trade_buy_cancel, trade_sell_cancel
    }

    public enum OrderStatus {
        open, filled, partial_filled, cancelled, trade_buy_cancel, trade_sell_cancel
    }
}
