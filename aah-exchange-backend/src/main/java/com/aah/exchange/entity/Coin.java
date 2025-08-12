package com.aah.exchange.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 'cex_coins' 테이블과 매핑되는 엔티티 클래스입니다.
 * 거래소에서 지원하는 코인 정보를 나타냅니다.
 */
@Data
@Entity
@Table(name = "cex_coins")
public class Coin {

    /**
     * 코인 고유 ID (기본 키)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 네트워크 (예: Ethereum, AAH, Bitcoin)
     */
    @Column(nullable = false, length = 50)
    private String network;

    /**
     * 코인 심볼 (예: ETH, AAH, BTC)
     */
    @Column(nullable = false, length = 20)
    private String symbol;

    /**
     * 네트워크 심볼 (예: ETH, AAH, BTC, SOLANA)
     */
    @Column(name = "net_symbol", nullable = false, length = 50)
    private String netSymbol;

    /**
     * 코인 이름
     */
    @Column(nullable = false, length = 50)
    private String name;

    /**
     * 활성화 여부
     */
    @Column(name = "is_active", columnDefinition = "tinyint(1) default 1")
    private Boolean isActive;

    /**
     * ERC-20, SPL 토큰의 경우 컨트랙트 주소
     */
    @Column(name = "contract_address", length = 255)
    private String contractAddress;

    /**
     * 소수점 자릿수
     */
    @Column(nullable = false)
    private Integer decimals;

    /**
     * 최소 입금 금액
     */
    @Column(name = "min_deposit", precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal minDeposit;

    /**
     * 최소 출금 금액
     */
    @Column(name = "min_withdrawal", precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal minWithdrawal;

    /**
     * 출금 수수료
     */
    @Column(name = "withdrawal_fee", nullable = false, precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal withdrawalFee;

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

    /**
     * 하루 출금한도
     */
    @Column(name = "max_daily_withdraw", precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal maxDailyWithdraw;

    /**
     * 총 발행량
     */
    @Column(name = "total_supply", precision = 20, scale = 8, columnDefinition = "decimal(20,8) default 0.0")
    private BigDecimal totalSupply;

    /**
     * 공식 웹사이트 URL
     */
    @Column(name = "official_website", length = 255)
    private String officialWebsite;

    /**
     * 트위터 URL
     */
    @Column(name = "sns_twitter", length = 255)
    private String snsTwitter;

    /**
     * 텔레그램 URL
     */
    @Column(name = "sns_telegram", length = 255)
    private String snsTelegram;

    /**
     * 백서 URL
     */
    @Column(name = "whitepaper_url", length = 255)
    private String whitepaperUrl;
}
