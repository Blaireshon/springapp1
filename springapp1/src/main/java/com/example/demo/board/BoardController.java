package com.example.demo.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

	@GetMapping("/add")
	public void boardForm() {
		
	}
	
	@PostMapping("/add")
	public String board(@ModelAttribute("b") BoardVo vo) {
		return "board/list";
	}
}
