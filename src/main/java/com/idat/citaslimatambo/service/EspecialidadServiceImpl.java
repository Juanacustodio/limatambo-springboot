package com.idat.citaslimatambo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.idat.citaslimatambo.model.Especialidad;
import com.idat.citaslimatambo.repository.EspecialidadRepository;

public class EspecialidadServiceImpl implements EspecialidadService{
	@Autowired
	EspecialidadRepository repository;
	
	@Override
	public List<Especialidad> getAll() {
		return (List<Especialidad>) repository.findAll();
	}

	@Override
	public Especialidad getById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Especialidad especialidad) {
		repository.save(especialidad);		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);	
	}

}

