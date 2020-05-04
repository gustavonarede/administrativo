package br.com.gustavo.agendamento.model.entidade;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Medico  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id_medico")
	private Integer idMedico;
	@Column(name ="medico" ,nullable=false, length=100)
	private String medico;
	
	@Column(name ="crm" ,nullable=false, length=30)
	private String crm ;
	@Embedded
	private Endereco endereco;
	
	@Column(name ="email", nullable=false, length=100)
	private String email;
	@Column(name ="Senha", nullable=false, length=20)
	private String Senha;
	@Column(name ="ddd", nullable=false, length=3)
	private String ddd;
	@Column(name ="celular", nullable=false, length=10)
	private String celular;
	@Enumerated(EnumType.STRING)
	@Column(name ="sexo", nullable=false, length=30)
	private Sexo sexo;
	@Column(name ="cpf", nullable=false, length=15)
	private String cpf;
	@Column(name ="rg", nullable=true, length=20)
	private String rg;
	@Column(name ="data_nascimento", nullable=false)
	private LocalDate dataNascimento;
	@Column(name ="data_cadastro", nullable=false)
	private LocalDate dataCadastro;
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	@Override
	public String toString() {
		return "Medico [idMedico=" + idMedico + ", medico=" + medico + ", crm=" + crm + ", endereco=" + endereco
				+ ", email=" + email + ", Senha=" + Senha + ", ddd=" + ddd + ", celular=" + celular + ", sexo=" + sexo
				+ ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", dataCadastro="
				+ dataCadastro + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idMedico == null) ? 0 : idMedico.hashCode());
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
		Medico other = (Medico) obj;
		if (idMedico == null) {
			if (other.idMedico != null)
				return false;
		} else if (!idMedico.equals(other.idMedico))
			return false;
		return true;
	}
	
	
	
	
}
