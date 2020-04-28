package application;

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
	
	public static void main(String[] args) {
		
		/*
		 * Quando utilizar o HashSet?
		 * 	- Quando a performance e velocidade do meu programa importam
		 * 	- Os elementos serão desordenados e sem haver possibilidade de ordenação
		 * 	- Antes de adicionar, ele checará todo o set, para que não haja repetição
		 */
		
		Set<Integer> n = new HashSet<>();
		
		n.add(3);
		n.add(88);
		n.add(20);
		n.add(44);
		n.add(3); // Não adicionará na execução do programa
		
		System.out.println(n);
		
		n.remove(3);
		
		n.add(23);
		
		System.out.println("Novo Set: " + n);
		
		System.out.println("Tamanho do Set: " + n.size());

		System.out.println(n.isEmpty() ? "Set Vazio" : "Set Cheio");
	}

}
