package com.aah.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * AAH 거래소 Spring Boot 애플리케이션의 메인 클래스입니다.
 * 이 클래스는 애플리케이션의 시작점 역할을 합니다.
 */
@SpringBootApplication
public class AahExchangeApplication {

	/**
	 * 애플리케이션을 시작하는 메인 메소드입니다.
	 * @param args 커맨드 라인 인자
	 */
	public static void main(String[] args) {
		SpringApplication.run(AahExchangeApplication.class, args);
	}

}
