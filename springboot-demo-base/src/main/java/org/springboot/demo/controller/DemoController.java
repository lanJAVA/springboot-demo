package org.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@RequestMapping("/demo")
	@ResponseBody   //将方法的返回值以Rest风格返回@ResponseBody + @Controller == @RestController
	public String demo() {
		return "hello world!" ;
	}
}
