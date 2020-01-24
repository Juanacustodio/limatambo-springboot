package com.idat.citaslimatambo.service;

import java.util.List;

import com.idat.citaslimatambo.model.Sede;

public interface SedeService {
	public List<Sede> getAll();
	 
	public Sede getById(long id);
	 
	public void saveOrUpdate(Sede sede);
	 
	public void delete(long id);
}
