package com.demo.Library.service;

import java.util.List;

import com.demo.Library.model.Library;

public interface LibraryService {
	
	public Library save(Library lib);
	
	public List<Library> find();
	
	public void delete(Integer id);
	
	public Library update(Library lib);

}
