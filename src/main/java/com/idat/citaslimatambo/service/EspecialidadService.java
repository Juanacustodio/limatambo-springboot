package com.idat.citaslimatambo.service;

import java.util.List;

import com.idat.citaslimatambo.model.Especialidad;

public interface EspecialidadService {
	public List<Especialidad> getAll();
	 
	public Especialidad getById(long id);
	 
	public void saveOrUpdate(Especialidad especialidad);
	 
	public void delete(long id);
}
