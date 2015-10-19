package net.tuos.oauth.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableTransactionManagement
public class ServiceConfig {

	@Bean
	public InternalResourceViewResolver getInternalResourceViewResolver() {
		final InternalResourceViewResolver internalResolver = new InternalResourceViewResolver();
		internalResolver.setPrefix("/WEB-INF/views/");
		internalResolver.setSuffix(".jsp");
		return internalResolver;
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
}
