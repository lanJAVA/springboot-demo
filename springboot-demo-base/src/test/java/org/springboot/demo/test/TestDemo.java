package org.springboot.demo.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.demo.controller.DemoController;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes=DemoController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDemo {
	@Resource
	private DemoController demoController ;
	@Test
	public void testDemo() {
		System.out.println(this.demoController.demo());
	}
}
