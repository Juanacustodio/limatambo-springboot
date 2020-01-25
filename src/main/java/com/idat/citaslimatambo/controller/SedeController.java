package com.idat.citaslimatambo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.idat.citaslimatambo.model.Sede;
import com.idat.citaslimatambo.service.SedeService;


@Controller
@RequestMapping(value="/sede")
public class SedeController {
	 @Autowired
	 SedeService service;
	 
	 @RequestMapping(value="/listSede", method=RequestMethod.GET)
	 public ModelAndView list() {
		 ModelAndView model = new ModelAndView("list");
		 List<Sede> list = service.getAll();
		 model.addObject("list", list);

		 return model;
	 }
	 
	 @RequestMapping(value="/addSede/", method=RequestMethod.GET)
	 public ModelAndView add() {
		 ModelAndView model = new ModelAndView();

		 Sede sede = new Sede();
		 model.addObject("form", sede);
		 model.setViewName("sede_form");
		  
		 return model;
	 }
	 
	 @RequestMapping(value="/updateSede/{id}", method=RequestMethod.GET)
	 public ModelAndView editArticle(@PathVariable int id) {
		 ModelAndView model = new ModelAndView();

		 Sede sede = service.getById(id);
		 model.addObject("form", sede);
		 model.setViewName("article_form");
 
		 return model;
	 }
	 
	 @RequestMapping(value="/saveSede", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("form") Sede sede) {
		 service.saveOrUpdate(sede);
	  
		 return new ModelAndView("redirect:/sede/list");
	 }
	 
	 @RequestMapping(value="/deleteSede/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
		 service.delete(id);
	  
		 return new ModelAndView("redirect:/sede/list");
	 }
}
