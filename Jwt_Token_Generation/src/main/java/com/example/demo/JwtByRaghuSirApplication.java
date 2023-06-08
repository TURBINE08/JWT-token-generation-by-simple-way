package com.example.demo;

import java.util.Base64;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@SpringBootApplication
public class JwtByRaghuSirApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtByRaghuSirApplication.class, args);
		
		String key = "NIT";
		String token = 
		Jwts.builder()
		.setId("A5266")
		.setSubject("Ajay")
		.setIssuer("Naresh IT")
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis()+10000))
		.signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(key.getBytes()))
		.compact();
		System.err.println(token);
		
	}

}
