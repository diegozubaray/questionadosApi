package ar.com.questionados.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "preguntas")
public class Pregunta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idpreguntas;
	private String enunciado;
	
	@JsonBackReference
    @ManyToOne
    @JoinColumn(name="idcategorias", nullable=false)
	private Long idcategoria;
	
	@JsonManagedReference
	@OneToMany(mappedBy ="idPreguntas")
	private Set<Respuesta> respuestas;
	

	public Set<Respuesta> getRespuestas() {
		return respuestas;
	}
	public void setRespuestas(Set<Respuesta> respuestas) {
		this.respuestas = respuestas;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public Long getIdpreguntas() {
		return idpreguntas;
	}
	public void setIdpreguntas(Long idpreguntas) {
		this.idpreguntas = idpreguntas;
	}
	public Long getIdcategoria() {
		return idcategoria;
	}
	public void setIdcategoria(Long idcategoria) {
		this.idcategoria = idcategoria;
	}

	

}
