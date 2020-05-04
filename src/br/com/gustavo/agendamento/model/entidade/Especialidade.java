package br.com.gustavo.agendamento.model.entidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Especialidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_especialidade",nullable = false)
	private Integer idEspecialidade;
	
	@Column(name = "especialidade", nullable = false, length = 40)
	private String especialidade;

	public Integer getIdEspecialidade() {
		return idEspecialidade;
	}

	public void setIdEspecialidade(Integer idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Especialidade [idEspecialidade=" + idEspecialidade + ", especialidade=" + especialidade + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEspecialidade == null) ? 0 : idEspecialidade.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidade other = (Especialidade) obj;
		if (idEspecialidade == null) {
			if (other.idEspecialidade != null)
				return false;
		} else if (!idEspecialidade.equals(other.idEspecialidade))
			return false;
		return true;
	}
	
	
}
