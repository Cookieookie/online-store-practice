package com.javamaster;

import com.javamaster.Entity.User;
import com.javamaster.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.config.annotation.web.oauth2.login.UserInfoEndpointDsl;

@SpringBootApplication
public class OnlineStoreExampleApplication {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreExampleApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void testRepository() {
		User u = new User();
		u.setAddress("1608 W. Lee St");
		u.setFirstName("Patrick");
		u.setPhone("174-688-9246");
		userRepository.save(u);
	}
}
