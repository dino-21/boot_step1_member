# spring.application.name=member
# server.port=8282

#MySQL 연결 설정
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/member?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=1234

#실행되는 쿼리 콘솔 출력
spring.jpa.properties.hibernate.show_sql=true


#콘솔창에 출력되는 쿼리를 가독성이 좋게 포맷팅
spring.jpa.properties.hibernate.format_sql=true

#쿼리에 물음표로 출력되는 바인드 파라미터 출력
logging.level.org.hibernate.type.descriptor.sql=trace

# JPA 자동 테이블 생성 및 업데이트 설정
spring.jpa.hibernate.ddl-auto=update

# MySQL 8용 Hibernate 방언 설정
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect


