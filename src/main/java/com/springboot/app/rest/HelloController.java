package com.springboot.app.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.entity.Country;
import com.springboot.app.repo.CountryRepo;

@RestController
public class HelloController {

	@Autowired
	private CountryRepo repo;

	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return repo.findAll();
	}

	@GetMapping("/country/{id}")
	public Optional<Country> getById(@PathVariable("id") Long id) {
		return repo.findById(id);
	}

	@PostMapping("/add-countries")
	public Country saveCountry(@RequestBody Country country) {
		return repo.save(country);
	}

	@DeleteMapping("/del-country/{id}")
	public void deleteCountryById(@PathVariable("id") Long id) {
		repo.deleteById(id);
	}

}
