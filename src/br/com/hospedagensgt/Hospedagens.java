package br.com.hospedagensgt;

public class Hospedagens {
	
	private String Nome;
	private String Endere�o;
	private String ValorDiaria;
	private boolean CafeDaManha;
	
	
	
	
	
	public Hospedagens() {
		super();
	}



	public Hospedagens(String nome, String endere�o, String valorDiaria, boolean cafeDaManha) {
		super();
		Nome = nome;
		Endere�o = endere�o;
		ValorDiaria = valorDiaria;
		CafeDaManha = cafeDaManha;
	}
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
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
