package com.demo.Library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Library.model.Library;
import com.demo.Library.service.LibraryService;



@RestController
public class LibraryController {
	
	
	
	@Autowired
	LibraryService libservice;
	
	@PostMapping("/save")
	public Library save(@RequestBody Library lib) {
		return libservice.save(lib);
	}
	
	@GetMapping("/find")
	public List<Library> find(){
		
		return libservice.find();
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		libservice.delete(id);
	}
	
	@PutMapping("/update")
	public Library update(@RequestBody Library lib) {
		
		return libservice.update(lib);
	}

}
