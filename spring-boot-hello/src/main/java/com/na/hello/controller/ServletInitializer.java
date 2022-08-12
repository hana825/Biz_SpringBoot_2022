package com.na.hello.controller;

// Ctrl + Alt + O
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/*
SpringBootServletInitializer 클래스
Boot Project 에서 root-context.xml, sevlet-context.xml 을 대신하는 클래스로서
여기에서 HelloApplication.class.main() method 를 내부에서 호출한다.
 */


/*
@ComponentScan
Annotation 을 이용하여 Class 를 Scan 하여 bean 으로 생성하도록 하는 지시어
여러 개의 Scan 이 필요할 경우 문자열 배열을 사용하여 주입한다.
 */
@ComponentScan({"com.na.hello.controller", "com.na.hello.service"})
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(HelloApplication.class);
	}

}
