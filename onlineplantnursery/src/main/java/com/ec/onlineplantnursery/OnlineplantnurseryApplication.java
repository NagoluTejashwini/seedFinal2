package com.ec.onlineplantnursery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Configuration
public class OnlineplantnurseryApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineplantnurseryApplication.class, args);
	}
	
	@Bean
	public Docket docket()
	{
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().build();
	}
	
	private ApiInfo apiInfo()
	{
		return new ApiInfoBuilder().title("Online Plant Nursery").description("Customer can order requied planters,plants,seeds")
				.version("onlinePlantNurseryV1.1").build();		}

}
