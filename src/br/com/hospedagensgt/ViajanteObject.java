package br.com.hospedagensgt;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ViajanteObject extends Viajante{

	public static void main(String[] args) {
		
		Viajante viajante = new Viajante();
		viajante.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		System.out.println(viajante.getNome());
		
		viajante.setSobrenome(JOptionPane.showInputDialog("Digite o Sobrenome: "));
		System.out.println(viajante.getSobrenome());
		
		viajante.setDataNascimento(Integer.parseInt(JOptionPane.showInputDialog("Digite sua Data de Nascimento: ")));
		System.out.println(viajante.getDataNascimento());
		
		viajante.setCPF(Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF: ")));
		System.out.println(viajante.getCPF());
		
		viajante.setDestino(JOptionPane.showInputDialog("Para onde você vai viajar? "));
		System.out.println(viajante.getDestino());
		
		
		//ArrayList
		
		ArrayList dadosV = new ArrayList();
		dadosV.add(viajante.getNome());
		dadosV.add(viajante.getSobrenome());
		dadosV.add(viajante.getDataNascimento());
		dadosV.add(viajante.getCPF());
		dadosV.add(viajante.getDestino());
		System.out.println(dadosV);

	}

}
