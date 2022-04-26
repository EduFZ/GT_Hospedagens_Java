package br.com.hospedagensgt;

public class Hospedagens {
	
	private String Nome;
	private String Endereço;
	private String ValorDiaria;
	private boolean CafeDaManha;
	
	
	
	
	
	public Hospedagens() {
		super();
	}



	public Hospedagens(String nome, String endereço, String valorDiaria, boolean cafeDaManha) {
		super();
		Nome = nome;
		Endereço = endereço;
		ValorDiaria = valorDiaria;
		CafeDaManha = cafeDaManha;
	}
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	public String getValorDiaria() {
		return ValorDiaria;
	}
	public void setValorDiaria(String valorDiaria) {
		ValorDiaria = valorDiaria;
	}
	public boolean isCafeDaManha() {
		return CafeDaManha;
	}
	public void setCafeDaManha(boolean cafeDaManha) {
		CafeDaManha = cafeDaManha;
	}
	
	
	
	
	
	
	
	
	

}
