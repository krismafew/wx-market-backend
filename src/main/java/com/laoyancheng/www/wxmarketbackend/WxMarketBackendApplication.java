package com.laoyancheng.www.wxmarketbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.laoyancheng.www.wxmarketbackend.db.mapper")
public class WxMarketBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(WxMarketBackendApplication.class, args);
	}
}
