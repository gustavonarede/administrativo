package br.com.gustavo.agendamento.model.entidade;

import javax.persistence.Embeddable;
import javax.persistence.Column;
@Embeddable
public class Endereco {

	@Column(name ="endereco",nullable=false, length=120)
	private String endereco;
	@Column(name ="cidade",nullable=false, length=80)
	private String cidade;
	@Column(name ="cep",nullable=false, length=10)
	private String cep;
	@Column(name ="uf",nullable=false, length=2)
	private String uf;
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	
}
