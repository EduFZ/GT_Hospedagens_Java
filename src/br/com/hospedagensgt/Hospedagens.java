package br.com.hospedagensgt;

public class Hospedagens {
	
	private String Nome;
	private String Enderešo;
	private String ValorDiaria;
	private boolean CafeDaManha;
	
	
	
	
	
	public Hospedagens() {
		super();
	}



	public Hospedagens(String nome, String enderešo, String valorDiaria, boolean cafeDaManha) {
		super();
		Nome = nome;
		Enderešo = enderešo;
		ValorDiaria = valorDiaria;
		CafeDaManha = cafeDaManha;
	}
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEnderešo() {
		return Enderešo;
	}
	public void setEnderešo(String enderešo) {
		Enderešo = enderešo;
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
