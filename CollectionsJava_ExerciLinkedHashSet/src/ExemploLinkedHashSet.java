import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		/*
		 * Quando utilizar o LinkedHashSet?
		 * 	- Quando for necess�rio mater a ordem dos elementos
		 * 	- Os elementos ser�o ordenados
		 * 	- Antes de adicionar, ele checar� todo o set, para que n�o haja repeti��o
		 */
		
		LinkedHashSet<Integer> n = new LinkedHashSet<>();
		
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
