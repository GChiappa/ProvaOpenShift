package com.gio.openshift.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gio.openshift.model.Contatto;
import com.gio.openshift.repository.ContattoRepository;
import com.gio.openshift.service.ContattoService;

@Service("contattoService")
public class ContattoServiceImpl implements ContattoService {

	@Autowired
	ContattoRepository cr;

	@Override
	public List<Contatto> getAll() {
		return cr.findAll();
	}

}
