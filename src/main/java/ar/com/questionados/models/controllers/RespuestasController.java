package ar.com.questionados.models.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.questionados.models.Respuesta;
import ar.com.questionados.repository.RespuestaRepository;

public class RespuestasController {

	@Autowired
	private RespuestaRepository rr;
	
	@GetMapping("/{id}")
	public Respuesta obtenerPorId(Long id) {
		return rr.findById(id).get();
	}	
	
	
}
