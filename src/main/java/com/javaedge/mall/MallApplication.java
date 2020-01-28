package com.javaedge.mall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JavaEdge
 */
@SpringBootApplication
@MapperScan(basePackages = "com.javaedge.mall.dao")
public class MallApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallApplication.class, args);
	}
}
