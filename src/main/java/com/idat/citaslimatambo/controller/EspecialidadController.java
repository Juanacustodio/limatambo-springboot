package com.idat.citaslimatambo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.idat.citaslimatambo.model.Especialidad;
import com.idat.citaslimatambo.service.EspecialidadService;



@Controller
@RequestMapping(value="/especialidad")

public class EspecialidadController {
	
	@Autowired
	 EspecialidadService service;
	 
	 @RequestMapping(value="/listEspecialidad", method=RequestMethod.GET)
	 public ModelAndView list() {
		 ModelAndView model = new ModelAndView("list");
		 List<Especialidad> list = service.getAll();
		 model.addObject("list", list);

		 return model;
	 }
	 
	 @RequestMapping(value="/addSede/", method=RequestMethod.GET)
	 public ModelAndView add() {
		 ModelAndView model = new ModelAndView();

		 Especialidad especialidad = new Especialidad();
		 model.addObject("form", especialidad);
		 model.setViewName("especialidad_form");
		  
		 return model;
	 }
	 
	 @RequestMapping(value="/updateEspecialidad/{id}", method=RequestMethod.GET)
	 public ModelAndView editArticle(@PathVariable int id) {
		 ModelAndView model = new ModelAndView();

		 Especialidad especialidad = service.getById(id);
		 model.addObject("form", especialidad);
		 model.setViewName("article_form");

		 return model;
	 }
	 
	 @RequestMapping(value="/saveEspecialidad", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("form") Especialidad especialidad) {
		 service.saveOrUpdate(especialidad);
	  
		 return new ModelAndView("redirect:/especialidad/list");
	 }
	 
	 @RequestMapping(value="/deleteEspecialidad/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 service.delete(id);
	  
		 return new ModelAndView("redirect:/sede/list");
	 }

}
