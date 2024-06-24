package com.projectshub.securitydemo;

import com.projectshub.securitydemo.model.User;
import com.projectshub.securitydemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecuritydemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(SecuritydemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user1=new User();
		user1.setUsername("surya");
		user1.setPassword(bCryptPasswordEncoder.encode("surya"));
		user1.setEmail("surya@gmail.com");
		user1.setRole("ROLE_ADMIN");
		userRepository.save(user1);

		User user2=new User();
		user2.setUsername("raju");
		user2.setPassword(bCryptPasswordEncoder.encode("raju"));
		user2.setEmail("raju@gmail.com");
		user2.setRole("ROLE_NORMAL");
		userRepository.save(user2);
	}
}
