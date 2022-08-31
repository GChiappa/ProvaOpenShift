package com.gio.openshift.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gio.openshift.model.Contatto;
import com.gio.openshift.service.ContattoService;

@RestController
public class ServiceRestController {

	@Autowired
	ContattoService cs;

	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		return cs.getAll();
	}

}