package com.example.springsecurity.springsecurity;




import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class MyUser implements UserDetails{
	
	private static final String delimiter = ",";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Nonnull
	@Column(unique = true)
	private String name;
	
	@Nonnull
	private String username;
	
	@Nonnull
	private String password;
	
	private String authorities;
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		String authorityList[]= this.authorities.split(delimiter);
		return Arrays.stream(authorityList).map(e->new SimpleGrantedAuthority(e)).collect(Collectors.toList());
		
		//return null;
	}


	
}
