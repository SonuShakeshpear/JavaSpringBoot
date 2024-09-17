package com.example.springsecurity.springsecurity;

import jakarta.persistence.Entity;
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
public class UserCreateRequest {
	@Id
	private int id;
	
	private String username;
	
	private String password;
	
	private Boolean isDeveloper;

}
