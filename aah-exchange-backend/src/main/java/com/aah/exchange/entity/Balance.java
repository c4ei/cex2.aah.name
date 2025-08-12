package com.aah.exchange.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 'cex_balan' 테이블과 매핑되는 엔티티 클래스입니다.
 * 사용자 자산 정보를 나타냅니다.
 */
@Data
@Entity
@Table(name = "cex_balan")
public class Balance {

    /**
     * 자산 고유 ID (기본 키)
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
     * 코인 심볼
     */
    @Column(name = "coin_symbol", nullable = false, length = 20)
    private String coinSymbol;

    /**
     * 네트워크
     */
    @Column(nullable = false, length = 50)
    private String network;

    /**
     * 네트워크 심볼
     */
    @Column(name = "net_symbol", nullable = false, length = 50)
    private String netSymbol;

    /**
     * 사용 가능한 잔액
     */
    @Column(name = "amount_available", precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal amountAvailable;

    /**
     * 주문 또는 출금 대기 중인 잔액
     */
    @Column(name = "amount_on_hold", precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal amountOnHold;

    /**
     * 등록일시
     */
    @Column(name = "reg_date", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime regDate;

    /**
     * 변경일시
     */
    @Column(name = "upd_date")
    @UpdateTimestamp
    private LocalDateTime updDate;
}
