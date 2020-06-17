package snippet;

public class Snippet {
	spring:
	  datasource:
	    driver-class-name: com.mysql.cj.jdbc.Driver
	    password: root
	    url: jdbc:mysql://localhost:3306/spring
	    username: root
	  jpa:
	    hibernate:
	      ddl-auto: update
	    properties:
	      hibernate:
	        format_sql: true
	    show-sql: true
	
}

