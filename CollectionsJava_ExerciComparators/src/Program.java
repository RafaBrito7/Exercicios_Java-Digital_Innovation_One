import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		List<Pessoa> pessoa = new ArrayList<>();

		System.out.println("Quantas pessoas você deseja inserir?");

		pessoa.add(new Pessoa("José", 1.8, 21));
		System.out.println("Pessoa " + pessoa.get(0).getName() + " Adicionada!");
		pessoa.add(new Pessoa("Alberto", 1.75, 45));
		System.out.println("Pessoa " + pessoa.get(1).getName() + " Adicionada!");
		pessoa.add(new Pessoa("Maria", 1.5, 40));
		System.out.println("Pessoa " + pessoa.get(2).getName() + " Adicionada!");

		System.out.println();

		System.out.println("-----------------Sem Ordenação-----------------");
		for (Pessoa p : pessoa) {
			System.out.println(p.toString());
		}
		System.out.println();
		pessoa.sort(Comparator.comparingDouble(Pessoa :: getHeight));
		System.out.println("Ordenado!");
		
		System.out.println("-----------------Com Ordenação Altura(Menor -> Maior)-----------------");
		for (Pessoa p : pessoa) {
			System.out.println(p.toString());
		}
		System.out.println();
		pessoa.sort(Comparator.comparingDouble(Pessoa :: getHeight).reversed());
		
		System.out.println("-----------------Com Ordenação Altura(Maior -> Menor)-----------------");
		for (Pessoa p : pessoa) {
			System.out.println(p.toString());
		}
		
		pessoa.sort(Comparator.comparing(Pessoa :: getName));
		
		System.out.println("-----------------Com Ordenação Nome(A -> Z)-----------------");
		for (Pessoa p : pessoa) {
			System.out.println(p.toString());
		}
		
		System.out.println("-----------------Com Ordenação Idade(Novo -> Velho)-----------------");
		
		Collections.sort(pessoa, new OrderComparable());
		
		for (Pessoa p : pessoa) {
			System.out.println(p.toString());
		}
		
		System.out.println("-----------------Com Ordenação Idade(Velho -> Novo)-----------------");
		Collections.sort(pessoa, new OrderComparable().reversed());
		
		for (Pessoa p : pessoa) {
			System.out.println(p.toString());
		}
	}

}
