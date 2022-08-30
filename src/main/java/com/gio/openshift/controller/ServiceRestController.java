package com.gio.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import com.gio.openshift.model.Contatto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceRestController {
	@RequestMapping("test")
	public List<Contatto> serviceTest() {
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario", "Rossi", "mario"));
		lista.add(new Contatto("Anna", "Rossi", "mario"));
		lista.add(new Contatto("Luca", "Rossi", "mario"));
		lista.add(new Contatto("Giorgina", "Rossi", "mario"));
		lista.add(new Contatto("Santos", "Rossi", "mario"));
		return lista;
	}

}