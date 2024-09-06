package com.javamaster;

import com.javamaster.Entity.UserEntity;
import com.javamaster.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class OnlineStoreExampleApplication {

	@Autowired
	private UserEntityRepository userEntityRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnlineStoreExampleApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void testRepository() {
		UserEntity u = new UserEntity();
		u.setAddress("1608 W. Lee St");
		u.setFirstName("Patrick");
		u.setPhone("174-688-9246");
		userEntityRepository.save(u);
	}
}
