package application;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
	
	public static void main(String[] args) {
		
		/*
		 * Quando utilizar o HashSet?
		 * 	- Quando a performance e velocidade do meu programa importam
		 * 	- Os elementos ser�o desordenados e sem haver possibilidade de ordena��o
		 * 	- Antes de adicionar, ele checar� todo o set, para que n�o haja repeti��o
		 */
		
		Set<Integer> n = new HashSet<>();
		
		n.add(3);
		n.add(88);
		n.add(20);
		n.add(44);
		n.add(3); // N�o adicionar� na execu��o do programa
		
		System.out.println(n);
		
		n.remove(3);
		
		n.add(23);
		
		System.out.println("Novo Set: " + n);
		
		System.out.println("Tamanho do Set: " + n.size());

		System.out.println(n.isEmpty() ? "Set Vazio" : "Set Cheio");
	}

}
