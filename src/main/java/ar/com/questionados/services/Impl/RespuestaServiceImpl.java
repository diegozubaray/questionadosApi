package ar.com.questionados.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.questionados.models.Categoria;
import ar.com.questionados.models.Respuesta;
import ar.com.questionados.repository.RespuestaRepository;
import ar.com.questionados.services.RespuestaService;

public class RespuestaServiceImpl implements RespuestaService {

	@Autowired
	private RespuestaRepository rr;
	
	
	@Override
	public Respuesta crearRespuesta(Respuesta respuesta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Respuesta obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return rr.findById(id).get();
	}
	
	

	@Override
	public List<Respuesta> obtenerTodas() {
		// TODO Auto-generated method stub
		return null;
	}

}
