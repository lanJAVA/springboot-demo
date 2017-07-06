package org.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("/member_add")
	public String add(String mid, Model model) {
		model.addAttribute("mid", mid);
		
		return "member/member_add";
	}
}
