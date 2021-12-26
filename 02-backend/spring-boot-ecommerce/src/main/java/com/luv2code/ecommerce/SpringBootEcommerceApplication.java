package com.luv2code.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

}

// 在这里右键点run，即在控制台启动程序 然后再自己启动postman app,点➕模拟前端get请求http://localhost:8080/api/products，看能不能收到数据
// 可以在浏览器查看api  http://localhost:8080/api  http://localhost:8080/api/products   http://localhost:8080/api/product-category
// copyright: Zongyi    github: https://github.com/Zongyi000?tab=repositories