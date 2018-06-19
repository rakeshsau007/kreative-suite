package com.org.avenger.infinity.controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.org.avenger.infinity.bean.Avengers;
import com.org.avenger.infinity.services.FileUploadService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/api")
@Component
public class FileUploadController {
	
	@Autowired
	FileUploadService storageService;
	
	List<String> files = new ArrayList<String>();
	private final Path rootLocation = Paths.get("D:\\");
	@RequestMapping("/welcome")
	public String demo(){
		
		return"Welocome On Board";
	} 
	
	
	
	@RequestMapping(value="/fileUpload",method = RequestMethod.POST )
	public ResponseEntity<?> handleFileUpload(@RequestParam("file") MultipartFile file) {
		
		String message = "";
		try {
			//storageService.store(file);
			System.out.println("Inside controller");
			Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
			files.add(file.getOriginalFilename());
			message = "You successfully uploaded " + file.getOriginalFilename() + "!";
			//List<Avengers> avengerList = new ArrayList<>();
			
			Avengers avneger = new Avengers();
			avneger.setAvengerId("007");
			avneger.setAvengerName("Captain America");
			
			
			
			return new ResponseEntity<>(avneger, HttpStatus.OK);
			//return ResponseEntity.status(HttpStatus.OK).body(message);
		} catch (Exception e) {
			message = "FAIL to upload " + file.getOriginalFilename() + "!";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
		}
		
	}
	
	@RequestMapping(value="/getallfiles")
	public ResponseEntity<List<String>> getListFiles(Model model) {
		List<String> fileNames = files
				.stream().map(fileName -> MvcUriComponentsBuilder
						.fromMethodName(FileUploadController.class, "getFile", fileName).build().toString())
				.collect(Collectors.toList());
 
		return ResponseEntity.ok().body(fileNames);
	}
 
	@RequestMapping("/files/{filename:.+}")
	@ResponseBody
	public ResponseEntity<Resource> getFile(@PathVariable String filename) {
		Resource file = storageService.loadFile(filename);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
				.body(file);
	}

}
