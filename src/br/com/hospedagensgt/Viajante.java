package br.com.hospedagensgt;

public class Viajante {
	
	private String Nome;
	private String Sobrenome;
	private int DataNascimento;
	private int CPF;
	private String Destino;
	
	
	
	
	
	public Viajante() {
		super();
	}



	public Viajante(String nome, String sobrenome, int dataNascimento, int cPF, String destino) {
		super();
		Nome = nome;
		Sobrenome = sobrenome;
		DataNascimento = dataNascimento;
		CPF = cPF;
		Destino = destino;
	}
	
	
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getSobrenome() {
		return Sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	public int getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(int dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getDestino() {
		return Destino;
	}
	public void setDestino(String destino) {
		Destino = destino;
	}
	
	
	
	
	
	

}
