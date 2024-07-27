package com.prohm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prohm.entity.Dr;
import com.prohm.repository.Drepository;

@RestController
public class Docrestcontroller {
	
	@Autowired
	private Drepository drreport;
	@GetMapping("/listalldocapi")
	//http://localhost:8080/listalldocapi
	public List<Dr>getalldocapi(Dr h){
		List<Dr> doctor = drreport.findAll();
		return doctor;
		
			}

	
	//http://localhost:8080/savedocapi
	@PostMapping("/savedocapi")
	public void savedocapi(@RequestBody Dr h) {
		
		Dr save = drreport.save(h);
		
	}
	//http://localhost:8080/updatedocapi
		@PutMapping("/updatedocapi")
		public void updatedocapi(@RequestBody Dr h) {
			
			Dr save = drreport.save(h);
			
		}
		//http://localhost:8080/deletedocapi/3
	@DeleteMapping("/deletedocapi/{id}")
	public void deletedocapi(@PathVariable("id")long id) {
		
		drreport.deleteById(id);
		
	}
		
		
		
		
		
		
		
	
	
}
