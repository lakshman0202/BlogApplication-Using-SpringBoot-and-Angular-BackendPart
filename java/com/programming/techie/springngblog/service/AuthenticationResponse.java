package com.programming.techie.springngblog.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticationResponse {
    public AuthenticationResponse(String authenticationToken2, String username2) {
		// TODO Auto-generated constructor stub
	}
	@SuppressWarnings("unused")
	private String authenticationToken;
    @SuppressWarnings("unused")
	private String username;
}