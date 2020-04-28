import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {

		/*
		 * Quando utilizar o LinkedHashSet?
		 * 	- Quando for necessário mater a ordem dos elementos
		 * 	- Os elementos serão ordenados
		 * 	- Antes de adicionar, ele checará todo o set, para que não haja repetição
		 */
		
		LinkedHashSet<Integer> n = new LinkedHashSet<>();
		
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
