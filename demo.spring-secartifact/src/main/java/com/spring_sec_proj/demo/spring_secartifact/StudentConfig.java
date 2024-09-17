package com.spring_sec_proj.demo.spring_secartifact;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class StudentConfig extends WebSecurityConfiguration{
	
	String DEVELOPER_AUTHORITY = "developer";
	String TESTER_AUTHORITY = "tester";
	String DEVOPS_AUTHORITY = "devops";
	
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
					.withUser("Sonu")
					.password("tyr@123")
					.authorities(DEVOPS_AUTHORITY)
					.and()
					.withUser("Ritik")
					.password("try@321")
					.authorities(DEVELOPER_AUTHORITY)
					.and()
					.withUser("Chhoti")
					.password("chhoti@123")
					.authorities(DEVELOPER_AUTHORITY, DEVOPS_AUTHORITY);
		
	}
	
	
	@Lazy
	//@SuppressWarnings("removal")
	protected void configureMatching(HttpSecurity httpSecurity) throws Exception{
		httpSecurity.httpBasic()
					.and()
					.authorizeHttpRequests()
					.requestMatchers("/devops/**").hasAuthority(DEVOPS_AUTHORITY)
					.requestMatchers("/devops/**").hasAuthority(DEVELOPER_AUTHORITY)
					.requestMatchers(HttpMethod.POST, "/sre/**").hasAnyAuthority(DEVELOPER_AUTHORITY)
					.requestMatchers(HttpMethod.POST, "/developer/**").hasAnyAuthority(DEVELOPER_AUTHORITY)
					.requestMatchers("/**").permitAll()
					.and().formLogin();
		
	}
	
	
	@Bean
	
	public PasswordEncoder getPE() {
		
	//	return new PasswordEncoder().encode(configure());
		return new BCryptPasswordEncoder();
	}
	
	
	
	
	
	

}
