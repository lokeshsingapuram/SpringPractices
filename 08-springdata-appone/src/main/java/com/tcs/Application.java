package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.entites.ContactMaster;
import com.tcs.repositories.ContactMasterRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ContactMasterRepo bean = context.getBean(ContactMasterRepo.class);
		ContactMaster entity=new ContactMaster();
		//entity.setId(103);
		entity.setContactName("vladmir Putin");
		entity.setContactNumber(972892344);
		bean.save(entity);
	}

}
