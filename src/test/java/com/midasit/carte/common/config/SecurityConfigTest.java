package com.midasit.carte.common.config;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfigTest {
	@Test
	public void testEncrypt() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String origin1 = "1234";
		String origin2 = "Werasdfw3%#x";
		String encoded1 = encoder.encode(origin1);
		String encoded2 = encoder.encode(origin2);
		assertTrue(encoder.matches(origin1, encoded1));
		assertTrue(encoder.matches(origin2, encoded2));
	}

	@Test
	public void testEncryptOne() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		String origin = "1234";
		System.out.println(encoder.encode(origin));
	}
}
