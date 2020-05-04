package br.com.gustavo.agendamento.model.entidade;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Agenda  implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_agenda")
	private Integer idAgenda;
	@ManyToOne
	@JoinColumn(name = "id_medico", nullable = false)
	private Medico medico;
	@Enumerated(EnumType.STRING)
	@Column(name="turno",nullable = false,length = 10)
	private Turno turno;
	@Column(name = "qtde_inscrito",columnDefinition = "NUMERIC(11) Default 0",insertable = false, updatable= false)
	private Integer qtdeInscrito;
	@Column(name = "qtde_confirmado",columnDefinition = "NUMERIC(11) Default 0",insertable = false, updatable= false)
	private Integer qtdeConfirmado;
	@Column(name = "data",nullable = false)
	private LocalDate data;
	public Integer getIdAgenda() {
		return idAgenda;
	}
	public void setIdAgenda(Integer idAgenda) {
		this.idAgenda = idAgenda;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}
	public Integer getQtdeInscrito() {
		return qtdeInscrito;
	}
	public void setQtdeInscrito(Integer qtdeInscrito) {
		this.qtdeInscrito = qtdeInscrito;
	}
	public Integer getQtdeConfirmado() {
		return qtdeConfirmado;
	}
	public void setQtdeConfirmado(Integer qtdeConfirmado) {
		this.qtdeConfirmado = qtdeConfirmado;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Agenda [idAgenda=" + idAgenda + ", medico=" + medico + ", turno=" + turno + ", qtdeInscrito="
				+ qtdeInscrito + ", qtdeConfirmado=" + qtdeConfirmado + ", data=" + data + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idAgenda == null) ? 0 : idAgenda.hashCode());
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
		Agenda other = (Agenda) obj;
		if (idAgenda == null) {
			if (other.idAgenda != null)
				return false;
		} else if (!idAgenda.equals(other.idAgenda))
			return false;
		return true;
	}
	
	
}
