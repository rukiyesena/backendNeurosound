package com.example.template;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.exception.DataException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.security.auth.login.Configuration;
import java.sql.SQLException;
import java.util.Locale;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableScheduling

public class App  {

	public static final String APP_NAME = "Example API";
	public static final String VERSION = "0.1";

	public static void main(String[] args) {
		Locale.setDefault(Locale.ENGLISH);
		SpringApplication.run(App.class, args);
	}

	@Bean(name = "masterSessionFactory")
	public SessionFactory getMasterSessionFactory() throws SQLException {
		SessionFactory sessionFactory ;
		LocalSessionFactoryBuilder builder = HibernateManager.createLocalSessionFactoryBuilder(HibernateManager.createMysqlDataSource(), HibernateManager.PACKAGES_MASTER);
		sessionFactory = builder.buildSessionFactory();
		return sessionFactory;
	}

}
