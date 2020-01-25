package com.idat.citaslimatambo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.idat.citaslimatambo.model.Paciente;
import com.idat.citaslimatambo.repository.PacienteRepository;


public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	PacienteRepository repository;
	
	@Override
	public List<Paciente> getAll() {
		return (List<Paciente>) repository.findAll();
	}

	@Override
	public Paciente getById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Paciente paciente) {
		repository.save(paciente);		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);	
	}
	

}
