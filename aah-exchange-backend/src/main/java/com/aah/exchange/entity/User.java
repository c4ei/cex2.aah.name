package com.aah.exchange.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 'users' 테이블과 매핑되는 엔티티 클래스입니다.
 * 사용자 정보를 나타냅니다.
 */
@Data
@Entity
@Table(name = "users")
public class User {

    /**
     * 사용자 고유 ID (기본 키)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idx;

    /**
     * 닉네임
     */
    @Column(length = 50)
    private String nickname;

    /**
     * 이메일 (고유 값)
     */
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    /**
     * 비밀번호
     */
    @Column(length = 100)
    private String pwd;

    /**
     * 사용자 이름
     */
    @Column(length = 100)
    private String username;

    /**
     * 아바타 이미지 경로
     */
    @Column(length = 150)
    private String avatar;

    /**
     * AAH 지갑 주소
     */
    @Column(name = "aah_addr", nullable = false, length = 63)
    private String aahAddr;

    /**
     * AAH 잔액
     */
    @Column(name = "aah_balance", nullable = false, length = 40, columnDefinition = "varchar(40) default '0'")
    private String aahBalance;

    /**
     * 채굴 여부 (Y/N)
     */
    @Column(name = "miningYN", nullable = false, length = 1, columnDefinition = "char(1) default 'N'")
    private String miningYN;

    /**
     * 게임 점수
     */
    @Column(nullable = false, precision = 18, scale = 0, columnDefinition = "decimal(18,0) default 0")
    private BigDecimal score;

    /**
     * 보유 코인
     */
    @Column(nullable = false, precision = 18, scale = 0, columnDefinition = "decimal(18,0) default 100")
    private BigDecimal coin;

    /**
     * 레벨
     */
    @Column(columnDefinition = "int default 1")
    private Integer level;

    /**
     * 경험치
     */
    @Column(columnDefinition = "int default 0")
    private Integer exp;

    /**
     * 수령한 AAH 코인
     */
    @Column(name = "rcvCoin", precision = 18, scale = 18, columnDefinition = "decimal(18,18) default 0.0")
    private BigDecimal rcvCoin;

    /**
     * 추천인 이메일
     */
    @Column(name = "ref_email", length = 100)
    private String refEmail;

    /**
     * 추천인 수
     */
    @Column(name = "ref_cnt", nullable = false, columnDefinition = "int default 0")
    private Integer refCnt;

    /**
     * 로그인 횟수
     */
    @Column(name = "login_cnt", nullable = false, columnDefinition = "int default 0")
    private Integer loginCnt;

    /**
     * 마지막 로그인 날짜
     */
    @Column(name = "login_date", nullable = false)
    @CreationTimestamp
    private LocalDateTime loginDate;

    /**
     * 등록 날짜
     */
    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime regdate;

    /**
     * 수정 날짜
     */
    @Column(name = "upd_date", nullable = false)
    @UpdateTimestamp
    private LocalDateTime updDate;

    /**
     * 마지막 활동 시간
     */
    @Column(name = "last_active")
    @UpdateTimestamp
    private LocalDateTime lastActive;

    /**
     * 차단 여부 (Y/N)
     */
    @Column(name = "is_banned", length = 1, columnDefinition = "enum('Y','N') default 'N'")
    private String isBanned;

    /**
     * 사용자 유형 (U: User, P: Partner, A: Admin, B: Bot)
     */
    @Column(name = "userType", nullable = false, length = 1, columnDefinition = "varchar(1) default 'U'")
    private String userType;

    /**
     * 구글 ID
     */
    @Column(name = "google_id", length = 60)
    private String googleId;

    /**
     * 구글 토큰
     */
    @Column(name = "google_token", length = 300)
    private String googleToken;

    /**
     * 사진 경로
     */
    @Column(length = 1000)
    private String photos;

    /**
     * 추천인 ID
     */
    @Column(name = "referrer_id")
    private Integer referrerId;

    /**
     * 2단계 인증 활성화 여부 (Y/N)
     */
    @Column(name = "two_factor_enabled", length = 1, columnDefinition = "varchar(1) default 'N'")
    private String twoFactorEnabled;

    /**
     * 2단계 인증 비밀 키
     */
    @Column(name = "two_factor_secret", length = 1000)
    private String twoFactorSecret;

    /**
     * 포인트
     */
    @Column(precision = 18, scale = 2, columnDefinition = "decimal(18,2) default 100.00")
    private BigDecimal point;

    /**
     * 주소
     */
    @Column(length = 100)
    private String address;

    /**
     * 상세 주소
     */
    @Column(name = "detail_address", length = 100)
    private String detailAddress;

    /**
     * 우편번호
     */
    @Column(length = 10)
    private String zipcode;

    /**
     * 전화번호
     */
    @Column(length = 15)
    private String phone;

    /**
     * 등록 IP
     */
    @Column(name = "reg_ip", length = 15)
    private String regIp;

    /**
     * 마지막 로그인 IP
     */
    @Column(name = "login_ip", length = 15)
    private String loginIp;

    /**
     * 수수료 등급
     */
    @Column(name = "fee_tier", nullable = false, length = 50, columnDefinition = "varchar(50) default 'standard'")
    private String feeTier;
}
