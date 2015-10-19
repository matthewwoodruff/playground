package net.tuos.oauth.web.config;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"net.tuos.oauth.web.controller"})
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/").setCachePeriod(31556926);
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> exceptionResolvers) {
		
	}
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		super.addViewControllers(registry);
//		registry.addViewController("/login/form")
//			.setViewName("login");
//			registry.addViewController("/errors/403")
//			.setViewName("/errors/403");
//	}
	
//	@Bean
//	@Override
//	public RequestMappingHandlerMapping requestMappingHandlerMapping() {
//		RequestMappingHandlerMapping result = super.requestMappingHandlerMapping();
////		result.setUseSuffixPatternMatch(false);
//		result.setUseTrailingSlashMatch(false);
//		return result;
//	}
	
}
