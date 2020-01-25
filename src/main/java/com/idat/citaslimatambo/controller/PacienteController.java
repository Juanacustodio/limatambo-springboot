package com.idat.citaslimatambo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.idat.citaslimatambo.model.Paciente;
import com.idat.citaslimatambo.service.PacienteService;


@Controller
@RequestMapping(value="/paciente")

public class PacienteController {
	
	@Autowired
	PacienteService service;
	 
	 @RequestMapping(value="/listPaciente", method=RequestMethod.GET)
	 public ModelAndView list() {
		 ModelAndView model = new ModelAndView("list");
		 List<Paciente> list = service.getAll();
		 model.addObject("list", list);

		 return model;
	 }
	 
	 @RequestMapping(value="/addSede/", method=RequestMethod.GET)
	 public ModelAndView add() {
		 ModelAndView model = new ModelAndView();

		 Paciente paciente = new Paciente();
		 model.addObject("form", paciente);
		 model.setViewName("paciente_form");
		  
		 return model;
	 }
	 
	 @RequestMapping(value="/updatePaciente/{id}", method=RequestMethod.GET)
	 public ModelAndView editArticle(@PathVariable int id) {
		 ModelAndView model = new ModelAndView();

		 Paciente paciente = service.getById(id);
		 model.addObject("form", paciente);
		 model.setViewName("article_form");

		 return model;
	 }
	 
	 @RequestMapping(value="/savePaciente", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("form") Paciente paciente) {
		 service.saveOrUpdate(paciente);
	  
		 return new ModelAndView("redirect:/paciente/list");
	 }
	 
	 @RequestMapping(value="/deletePaciente/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 service.delete(id);
	  
		 return new ModelAndView("redirect:/sede/list");
	 }

}
