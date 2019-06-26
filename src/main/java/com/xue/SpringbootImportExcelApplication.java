package com.xue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xue.repository.dao")
public class SpringbootImportExcelApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootImportExcelApplication.class, args);
	}

}
