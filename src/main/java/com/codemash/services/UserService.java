package com.codemash.services;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.codemash.entities.User;
@Service
public class UserService {

	
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		
		
		store.add(new User(UUID.randomUUID().toString(), "Mashiour", "trx@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "MashX", "trx@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "NasX", "trx@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Lil MashX", "trx@gmail.com"));
		
		
	}
	
	public List<User> getUsers(){
		
		return store;
	}
}
