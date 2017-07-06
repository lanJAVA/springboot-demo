package org.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //启动SpringBoot程序，自带子包扫描：等价于@EnableAutoConfiguration + @ComponentScan("org.springboot.demo.*")
public class StartSpringBoot {
	public static void main(String[] args) {
		SpringApplication.run(StartSpringBoot.class, args);
	}

}
