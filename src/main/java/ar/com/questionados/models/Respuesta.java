package ar.com.questionados.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "respuestas")
public class Respuesta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idrespuesta;
	
	private boolean es_correcta;
	
	private String texto;

	private Long idpregunta;
	//@ManyToOne
    //@JoinColumn(name="idpregunta", referencedColumnName = "idpreguntas")
	//@JsonIgnore
	//private Pregunta pregunta;

	public Long getIdrespuesta() {
		return idrespuesta;
	}

	public void setIdrespuesta(Long idrespuesta) {
		this.idrespuesta = idrespuesta;
	}

	public boolean isEs_correcta() {
		return es_correcta;
	}

	public void setEs_correcta(boolean es_correcta) {
		this.es_correcta = es_correcta;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Long getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(Long idpregunta) {
		this.idpregunta = idpregunta;
	}

    

    
	
    
  
	


	
	
}
