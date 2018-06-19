package com.org.avenger.infinity;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.org.avenger.infinity.controller.FileUploadController;
import com.org.avenger.infinity.services.FileUploadService;

@SpringBootApplication(scanBasePackages={"com.org.avenger.infinity"})
public class AvengerApplication {

	@Resource
	FileUploadService storageService;
 
	
	public static void main(String[] args) {
		SpringApplication.run(AvengerApplication.class, args);
	}
	
	
	//@Override
	public void run(String arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}
}
