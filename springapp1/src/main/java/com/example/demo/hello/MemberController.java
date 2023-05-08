package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member") // url 공통된 부분을 전체 적용이 되도록 public class에 맵핑함
public class MemberController {

	@GetMapping("/join")
	public void joinForm() {
		
	}
	
	@PostMapping("/join")
	public String join(@ModelAttribute("v") MemberVo vo) { //vo 파람은 자동으로 뷰페이지로 전달. 뷰페이지에서 이 객체는 소문자 클래스명으로 부름 MemberVo.id, MemberVo.pwd.. 
		//폼에 입력한 값들을 자동으로 vo에 담아서 전달받음. setName, setId...로 넣어야 하기 때문에 폼양식 id를 멤버변수 이름과 동일하게 작성
		// 객체는 디폴트 생성자로 만들고 값들은 setter로 넣어주기 때문에 값 4개를 모두 안받아도 됨
		//@ModelAttribute("v") : 커맨드 객체를 뷰 페이지에서 부름 이름지정. 이 코드는 v로 지정. v.id, v.pwd...
		System.out.println(vo);
		System.out.println("id :" + vo.getId());
		System.out.println("pwd :" + vo.getPwd());
		return "member/result";
	}
	
	@RequestMapping("/paramtest")
	public ModelAndView paramtest(@RequestParam("tel") String tel, @RequestParam(name="num", defaultValue="0") int num) { // 뷰페이지에 전달할 값을 ModelAndView에 담아서 전달
		System.out.println("tel : " + tel);
		System.out.println("num : " + num);
		ModelAndView mav = new ModelAndView("member/paramtest"); // 생성자에 뷰페이지 경로 지정할 수도 있고
//		mav.setViewName("member/paramtest"); // setViewName(뷰경로)로 뷰 경로를 지정할 수도 있다
		
		mav.addObject("tel", tel);
		mav.addObject("num", num);
		return mav;
	}
}
