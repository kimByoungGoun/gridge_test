# gridge test - polaris

## 환경
* 서버 위치 : aws ec2 사용
* DB : aws rds mariaDB 사용
* swagger url : http://54.180.100.72:8080/swagger-ui/ 로 진행
* API 명세서 링크 : https://docs.google.com/spreadsheets/d/1Q9cQvZZ5-GqQtB8JegOsC-l74MTEQRSTeG43ayZKSxU/edit?usp=sharing
* 체크리스트 링크 : https://docs.google.com/spreadsheets/d/1HYRq1qukBs2u87QxSfu0H4Dv3v2eiq-hb9KTHB47sj8/edit?usp=sharing

---
## 구성
* entity(DB) - DAO - service - controll 로 구성
* DTO를 정의하여 객체간 데이터 전송
* DAO에서는 CRUD를 진행, service에서 서비스 로직 구현, controller에서는 유효성 검사와 validation을 수행
* Account, Chat, Comment, Post, CommentReport, PostReport 로 분류하여 서비스 구성
* Product 는 기능 테스트용 임시 로직임
* API 명세서, ERD, spring boot 서버 + DB 환경, MVC 패턴 구조 구성
* API 구현 미비
