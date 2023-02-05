package com.demo.Library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Library.model.Library;

public interface repository extends JpaRepository<Library, Integer> {

}
