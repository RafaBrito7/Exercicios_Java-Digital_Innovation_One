import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		/*
		 * Quando utilizar o TreeSet? - Quando for necess�rio alterar a ordem atrav�s do
		 * uso de Comparators - Os elementos ser�o ordenados e pode ser reordenado - Tem
		 * boa performance pra leitura, mas baixa para altera��o (pois tem q reordenar)
		 */

		TreeSet<String> n = new TreeSet<>();

		n.add("Porto Alegre");
		n.add("Florian�polis");
		n.add("Curitiba");
		n.add("S�o Paulo");
		n.add("Rio de Janeiro");
		n.add("Belo Horizonte");

		System.out.println(n);

		// Retornar� a primeira cidade do topo da �rvore
		System.out.println("Primeiro -> " + n.first());

		// Retornar� a �ltima cidade do final da �rvore
		System.out.println("�ltimo -> " + n.last());

		// Retornar� a primeira cidade abaixo da cidade do par�metro da �rvore
		System.out.println("Abaixo: -" + n.lower("Florian�polis"));

		// Retornar� a primeira cidade acima da cidade do par�metro da �rvore
		System.out.println("Acima: -" + n.higher("Florian�polis"));
		
		System.out.println(n);
		
		//Retornar� a primeira cidade da �rvore, removendo ela
		System.out.println(n.pollFirst());
		
		System.out.println(n);
		
		//Retornar� a primeira cidade da �rvore, removendo ela
		System.out.println(n.pollLast());
		
		System.out.println(n);
		
		System.out.println("Tamanho: " + n.size());
		
		int i = 1;
		for (String string : n) {
			System.out.println(i + "-" + string);
			i++;
		}

	}

}
