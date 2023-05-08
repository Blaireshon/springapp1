package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 컨트롤러 클래스(핸들러 클래스와 비슷) 각각의 요청별로 처리해주는 역할 @Controller를 작성해줘야 함
public class HelloController {
	@RequestMapping("/")
	public String root() {
		return "index";
	}
	
	@RequestMapping("/hello/test2") //@RequestMapping get, post 전송방식 지정없이 url등록할 때. "/hello/test2"로 요청이 오면 아래 메서드(test2)를 실행. 그 결과를 뷰페이지경로를 반환
	public void test2(){
		
//      맵핑 메서드의 반환타입이 void면 url맵핑과 동일한 뷰 페이지로 설정됨. 		
//		return "hello/test2"; // WEB-INF/views/hello/test2.jsp와 같다. / url맵핑과 동일하므로 return 생략해도 해당 url로 간다.
	}
	
	
	//@GetMapping : get방식 요청 url 등록
	@GetMapping("/hello/test1") // 요청 url 등록
	public String test1() {
		return "hello/test1";
	}
}
