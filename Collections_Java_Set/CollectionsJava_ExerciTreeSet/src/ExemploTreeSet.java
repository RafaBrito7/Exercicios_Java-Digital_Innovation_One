import java.util.TreeSet;

public class ExemploTreeSet {

	public static void main(String[] args) {

		/*
		 * Quando utilizar o TreeSet? - Quando for necessário alterar a ordem através do
		 * uso de Comparators - Os elementos serão ordenados e pode ser reordenado - Tem
		 * boa performance pra leitura, mas baixa para alteração (pois tem q reordenar)
		 */

		TreeSet<String> n = new TreeSet<>();

		n.add("Porto Alegre");
		n.add("Florianópolis");
		n.add("Curitiba");
		n.add("São Paulo");
		n.add("Rio de Janeiro");
		n.add("Belo Horizonte");

		System.out.println(n);

		// Retornará a primeira cidade do topo da árvore
		System.out.println("Primeiro -> " + n.first());

		// Retornará a última cidade do final da árvore
		System.out.println("Último -> " + n.last());

		// Retornará a primeira cidade abaixo da cidade do parâmetro da árvore
		System.out.println("Abaixo: -" + n.lower("Florianópolis"));

		// Retornará a primeira cidade acima da cidade do parâmetro da árvore
		System.out.println("Acima: -" + n.higher("Florianópolis"));
		
		System.out.println(n);
		
		//Retornará a primeira cidade da árvore, removendo ela
		System.out.println(n.pollFirst());
		
		System.out.println(n);
		
		//Retornará a primeira cidade da árvore, removendo ela
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
