package com.tcs;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.tcs.entities.Insurance;
import com.tcs.repositories.InsuranceRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		InsuranceRepo bean = context.getBean(InsuranceRepo.class);
	    Insurance insurance=new Insurance();
	    insurance.setId(100);
	    insurance.setInsuranceName("LIC");
	    insurance.setMinAge(23);
	    insurance.setMaxAge(60);
	    insurance.setMinInsuredAmount(10000);
	    insurance.setMaxInsuredAmount(35000);
	    bean.save(insurance);
	    Optional<Insurance> findById = bean.findById(100);
	    System.out.println(findById);
	}

}
