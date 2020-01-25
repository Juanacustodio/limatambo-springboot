package com.idat.citaslimatambo.service;

import java.util.List;

import com.idat.citaslimatambo.model.Paciente;


public interface PacienteService {
	
	public List<Paciente> getAll();
	 
	public Paciente getById(int id);
	 
	public void saveOrUpdate(Paciente paciente);
	 
	public void delete(int id);

}
