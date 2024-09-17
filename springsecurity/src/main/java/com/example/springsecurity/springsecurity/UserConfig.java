package com.example.springsecurity.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class UserConfig {
	
	@Autowired
	UserService userService;
	
	//String DEVELOPER_AUTHORITY = "developer";
	String TESTER_AUTHORITY = "tester";
	//String DEVOPS_AUTHORITY = "devops";
	
	@Value("${user.authority.developer}")
	private String DEVELOPER_AUTHORITY;
	
	@Value("${user.authority.devops}")
	private String DEVOPS_AUTHORITY;
	
	

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeHttpRequests()
		.requestMatchers("/devops/**").hasAuthority(DEVOPS_AUTHORITY)
		.requestMatchers(HttpMethod.POST, "/sre/**").hasAnyAuthority(DEVELOPER_AUTHORITY)
		.requestMatchers(HttpMethod.POST, "/developer/**").hasAnyAuthority(DEVELOPER_AUTHORITY)
		.requestMatchers(HttpMethod.POST, "/createNewUser").permitAll()
		.requestMatchers("/**").permitAll()
		.and().formLogin();
		return http.build();
    }

	
	
	/*
	//@Override
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
	*/
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService);
		
	}
	
	
	/*
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
	*/
	
	
	@Bean
	
	public PasswordEncoder getPE() {
		
	//	return new PasswordEncoder().encode(configure());
		return new BCryptPasswordEncoder();
	}

}
