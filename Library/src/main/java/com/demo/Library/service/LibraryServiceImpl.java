package com.demo.Library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.Library.Repository.repository;
import com.demo.Library.model.Library;


@Service
public class LibraryServiceImpl implements LibraryService{

	

	
	@Autowired
	repository repo;
	
	@Override
	public Library save(Library lib) {
		return repo.save(lib);
	}

	@Override
	public List<Library> find() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);	
	}

	@Override
	public Library update(Library lib) {
		Library lib1= repo.findById(lib.getId()).orElse(null);
		lib1.setId(lib.getId());
		lib1.setAuthor(lib.getAuthor());
		lib1.setCost(lib.getCost());
		lib1.setTitle(lib.getTitle());
		
		return repo.save(lib1);
		
	}

}
