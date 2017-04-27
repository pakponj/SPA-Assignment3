package com.pakponj.assignment3.configurator;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tiles.web.util.TilesDecorationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

import com.pakponj.assignment3.database.StudentJDBCTemplate;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.pakponj.assignment3")
public class AppConfig extends WebMvcConfigurerAdapter{
	
	// Apache tiles configuration
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tc = new TilesConfigurer();
		tc.setDefinitions(new String[] {"/WEB-INF/views/**/tiles.xml"});
		tc.setCheckRefresh(true);
		return tc;
	}
	
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}
	
	
	// Handle static resources
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	
	// Datasource properties
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/assignment3?useUnicode=yes&characterEncoding=UTF-8");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		
		return dataSource;
	}
	
	@Bean
	public StudentJDBCTemplate getStudentJDBCTemplate() {
		StudentJDBCTemplate studentJDBCTemplate = new StudentJDBCTemplate();
		studentJDBCTemplate.setDataSource(getDataSource());
		return studentJDBCTemplate;
	}
}
