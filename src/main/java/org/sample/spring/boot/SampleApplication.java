package org.sample.spring.boot;

import org.sample.spring.boot.web.CustomRequestDataValueProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Bean
	public WebConfig webConfig() {
		return new WebConfig();
	}
	
	protected static class WebConfig extends WebMvcConfigurerAdapter{
		
		@Override
		public void addViewControllers(ViewControllerRegistry registry) {
			registry.addRedirectViewController("/redirect", "/link");
		}
	}
	
	@Bean
	public CustomRequestDataValueProcessor requestDataValueProcessor(){
		return new CustomRequestDataValueProcessor();
	}
	
}
