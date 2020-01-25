package com.idat.citaslimatambo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.idat.citaslimatambo.model.Sede;
import com.idat.citaslimatambo.repository.SedeRepository;

public class SedeServiceImpl implements SedeService {

	@Autowired
	SedeRepository repository;
	
	@Override
	public List<Sede> getAll() {
		return (List<Sede>) repository.findAll();
	}

	@Override
	public Sede getById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Sede sede) {
		repository.save(sede);		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);	
	}

}
