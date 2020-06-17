package com.tcs;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.entities.Contact;
import com.tcs.repositories.ContactRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactRepo bean = context.getBean(ContactRepo.class);
		List<Contact> list = bean.findcontactById(100);
		System.out.println(list);
		/*
		 * Contact contact=new Contact(); contact.setContactId(111);
		 */
		bean.updateContactName("Harish",105);
		
	}
	

}
