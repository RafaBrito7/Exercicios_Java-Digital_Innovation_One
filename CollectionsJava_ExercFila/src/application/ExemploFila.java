package application;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {

	public static void main(String[] args) {

		Queue<String> nomes = new LinkedList<>();

		// > Adicionando_Elementos_na_Fila
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		// >

		System.out.println(nomes);

		// > Retorna_HEAD_mas_não_remove
		System.out.println("Primeiro a ser chamado: " + nomes.peek());
		// >

		// > Retorna_HEAD_e_o_remove
		System.out.println("Chamando: " + nomes.poll());
		// >

		// > Adicionado_ultima_posição_Fila
		nomes.add("Daniel");
		System.out.println(nomes);
		// >

		// > Retorna_Tamanho_Fila
		System.out.println(nomes.size());
		// >

		// > Verifica_se_Fila_Vazia
		System.out.println(nomes.isEmpty() ? "Fila Vazia" : "Fila com elementos");
		// >

		System.out.println(nomes.contains("Carlos") ? "Está na Fila!" : "Não está na Fila!");

		nomes.clear();

		// > Verifica_se_Fila_Vazia
		System.out.println(nomes.isEmpty() ? "Fila Vazia" : "Fila com elementos");
		// >

	}

}
