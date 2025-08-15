# cex2.aah.name [cex.aah.name 클론 spring boot,react]
sudo apt install openjdk-21-jdk-headless
java -version
update-alternatives --config java
sudo apt install maven

1. ##### backend
cd aah-exchange-backend
mvn spring-boot:run
(cd aah-exchange-backend && mvn spring-boot:run)

2. ##### frontend
cd aah-exchange-frontend && npm install && npm run build

spring init --name=aah-exchange --build=maven --java-version=17 --packaging=jar --dependencies=web,data-jpa,mysql,lombok,security aah-exchange-backend

curl "https://start.spring.io/starter.zip?type=maven-project&language=java&bootVersion=3.2.5&groupId=com.aah&artifactId=aah-exchange-backend&name=aah-exchange&description=AAH%20Exchange%20project&packageName=com.aah.exchange&packaging=jar&javaVersion=17&dependencies=web,data-jpa,mysql,lombok,security" -o aah-exchange-backend.zip && unzip aah-exchange-backend.zip && rm aah-exchange-backend.zip

mkdir -p aah-exchange-backend/src/main/java/com/aah/exchange
mkdir -p aah-exchange-backend/src/main/resources
mkdir -p aah-exchange-backend/src/main/java/com/aah/exchange/entity
mkdir -p aah-exchange-backend/src/main/java/com/aah/exchange/repository
mkdir -p aah-exchange-backend/src/main/java/com/aah/exchange/service
mkdir -p aah-exchange-backend/src/main/java/com/aah/exchange/controller

npx create-react-app aah-exchange-frontend



# db password
aah-exchange-backend/src/main/resources/application-local.properties
spring.datasource.username=
spring.datasource.password=




### 1. 프로젝트 초기 설정 (진행중)
- [x] Spring Boot 프로젝트 생성 및 기본 설정
- [x] React 프로젝트 생성 및 기본 설정
- [x] Spring Boot - React 연동 설정
- [x] 데이터베이스 연결 설정

### 2. 백엔드 개발 (대기)
- [ ] tbl_cex.sql 스키마 분석 및 JPA 엔티티 생성 (진행중 - User, Coin, Order, Balance 완료)
- [ ] 기존 로직 분석 및 Spring Boot 서비스로 구현
- [ ] RESTful API 엔드포인트 설계 및 구현
- [ ] 보안 설정 (Spring Security)

### 3. 프론트엔드 개발 (대기)
- [ ] UI/UX 디자인 및 레이아웃 구성
- [ ] 주요 페이지 컴포넌트 개발
- [ ] 백엔드 API 연동 및 데이터 처리
- [ ] 상태 관리 라이브러리(Redux 등) 도입

### 4. 테스트 및 배포 (대기)
- [ ] 단위/통합 테스트 작성
- [ ] 빌드 및 배포 스크립트 작성
- [ ] 최종 테스트 및 버그 수정





----
mkdir -p aah-exchange-backend/src/main/resources/static && cp -r aah-exchange-frontend/build/* aah-exchange-backend/src/main/resources/static/
cd aah-exchange-backend && mvn clean install
cd aah-exchange-backend && java -jar target/aah-exchange-backend-0.0.1-SNAPSHOT.jar

