package com.luv2code.springboot.cruddemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	//create a docket bean i.e a method that returns a Docket bean
	
	@Bean
	public Docket api() {
				
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.luv2code.springboot.cruddemo"))//specify controller classes(in a package) u wanna expose
				.paths(PathSelectors.any())//specify the controller  that you wanna expose, using their endpoint pattern(antpattern)
				.build();//build the docket
	}
	//
	//swagger metadata url:http://localhost:8080/v2/api-docs
	//swagger UI url:http://localhost:8080/swagger-ui.html
	
	@SuppressWarnings("deprecation")//what is the latest Type used? 
	private ApiInfo getApiInfo() {
		
		return new ApiInfo("Crud Demo Service", "This page lists all the APIs in CrudDemoService",
				"1.0", "our terms are client friendly", "call Abel on 08067950474", "licence 1.0", "http://abelLicence.com");
	}
}
