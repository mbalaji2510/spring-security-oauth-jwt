package com.infosys.springsecurity.oauth.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableSwagger2
@EnableMongoAuditing
@ComponentScan("com.infosys")
@EnableMongoRepositories("com.infosys")
@EnableAutoConfiguration
@SpringBootApplication
public class SpringBootOAuthJwtApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuthJwtApplication.class, args);
		System.out.println("Welcome Kishore!!!");
	}
	
	@Bean
    public Docket employeeApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().apis(RequestHandlerSelectors.basePackage("com.infosys"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiDetails());
    }
	
	private ApiInfo apiDetails() {
		 return new ApiInfo("Employee Details API",
				 "Employee Details API",
				 "1.0",
				 "Free to use", 
				 new springfox.documentation.service.Contact("EmpSolution Team", "EmpSolution Team", "kishore@gmail.com"),
				 "API Licence", "");
	}
}
