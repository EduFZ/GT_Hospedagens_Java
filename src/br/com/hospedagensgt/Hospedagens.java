package br.com.hospedagensgt;

public class Hospedagens {
	
	private String Nome;
	private String Endereco;
	private String ValorDiaria;
	private String CafeDaManha;
	
	
	
	
	
	public Hospedagens() {
		super();
	}



	public Hospedagens(String nome, String endereco, String valorDiaria, String cafeDaManha) {
		super();
		Nome = nome;
		Endereco = endereco;
		ValorDiaria = valorDiaria;
		CafeDaManha = cafeDaManha;
	}
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	public String getValorDiaria() {
		return ValorDiaria;
	}
	public void setValorDiaria(String valorDiaria) {
		ValorDiaria = valorDiaria;
	}
	public String getCafeDaManha() {
		return CafeDaManha;
	}
	public void setCafeDaManha(String cafeDaManha) {
		CafeDaManha = cafeDaManha;
	}
	
	
	
	
	
	
	
	
	

}
