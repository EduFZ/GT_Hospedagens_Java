package br.com.hospedagensgt;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class HospedagensObject extends Hospedagens {

	public static void main(String[] args) {
		
		Hospedagens hospedagem = new Hospedagens();
		
		hospedagem.setNome(JOptionPane.showInputDialog("Digite o Nome do Hotel: "));
		System.out.println(hospedagem.getNome());
		
		hospedagem.setEndereco(JOptionPane.showInputDialog("Digite o Endere�o do Hotel: "));
		System.out.println(hospedagem.getEndereco());
		
		hospedagem.setValorDiaria(JOptionPane.showInputDialog("Digite o Valor da Di�ria: "));
		System.out.println(hospedagem.getValorDiaria());
		
		hospedagem.setCafeDaManha(JOptionPane.showInputDialog("Caf� da Manh� incluso? SIM / N�O "));
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
