package com.org.avenger.infinity.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.avenger.infinity.bean.Avengers;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value="/api")
@Component
public class DataController {
	
	
	@RequestMapping(value="/getalldata" , method = RequestMethod.POST , headers = {
    "content-type=application/json" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Avengers getListOfData(@RequestBody Avengers avengers) {
		
		/*Collection<String> readValues = new ObjectMapper().
				readValues(divisions, new TypeReference<Collection<String>>() { });*/
		System.out.println("the data is "+avengers.getAvengerId() );
		//List<String> divStore = new ArrayList<>();
		
		/*if(!StringUtils.isEmpty(divisions)){
			for(String d :divisions ){
				for(String s:stores){
					divStore.add(d);
					divStore.add(s);
				}
			}
		}*/
		
 
		return avengers; 
	}
	
	@RequestMapping("/welcomeToWorld")
	public String demoForData(){
		
		return"Welocome On Board";
	} 
 

}
