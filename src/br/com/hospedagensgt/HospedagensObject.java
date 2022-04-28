package br.com.hospedagensgt;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class HospedagensObject extends Hospedagens {

	public static void main(String[] args) {
		
		Hospedagens hospedagem = new Hospedagens();
		
		hospedagem.setNome(JOptionPane.showInputDialog("Digite o Nome do Hotel: "));
		System.out.println(hospedagem.getNome());
		
		hospedagem.setEndereco(JOptionPane.showInputDialog("Digite o Endereço do Hotel: "));
		System.out.println(hospedagem.getEndereco());
		
		hospedagem.setValorDiaria(JOptionPane.showInputDialog("Digite o Valor da Diária: "));
		System.out.println(hospedagem.getValorDiaria());
		
		hospedagem.setCafeDaManha(JOptionPane.showInputDialog("Café da Manhã incluso? SIM / NÃO "));
		System.out.println(hospedagem.getCafeDaManha());
		
		// ArrayList
		
		ArrayList dadosH = new ArrayList();
		dadosH.add(hospedagem.getNome());
		dadosH.add(hospedagem.getEndereco());
		dadosH.add(hospedagem.getValorDiaria());
		dadosH.add(hospedagem.getCafeDaManha());
		System.out.println(dadosH);
		
		
		
		

	}

}
