package com.springboot.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.entity.Country;

public interface CountryRepo extends JpaRepository<Country, Long> {
	

}
