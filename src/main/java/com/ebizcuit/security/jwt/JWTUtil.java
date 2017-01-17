package com.ebizcuit.security.jwt;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class JWTUtil {

	@Value("${jwt.secret}")
	private String secret;
	
	public User parseToken(String token)
	{
		try{
			Claims body = Jwts.parser()
							  .setSigningKey(secret)
							  .parseClaimsJws(token)
							  .getBody();
			String username = body.getSubject();
			
			//User u = new User(, token, false, false, false, false, null); 
			
		}catch(Exception e){
		}
		return null;
	}
	
}
