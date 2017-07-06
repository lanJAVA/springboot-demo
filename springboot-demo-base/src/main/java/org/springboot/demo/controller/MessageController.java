package org.springboot.demo.controller;

import org.springboot.util.AbstractBaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MessageController extends AbstractBaseController {
	@RequestMapping("/msg")
	public String msg(String mid) {
		return "ECHO : " +  super.getMessage("demo.message");
	}
}
