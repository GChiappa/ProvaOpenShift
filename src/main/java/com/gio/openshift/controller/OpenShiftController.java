package com.gio.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gio.openshift.model.Contatto;
import com.gio.openshift.service.ContattoService;

@Controller
public class OpenShiftController {

	@Autowired
	ContattoService cs;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");

		List<Contatto> lista = cs.getAll();
		mv.addObject("lista", lista);

		return mv;
	}

}