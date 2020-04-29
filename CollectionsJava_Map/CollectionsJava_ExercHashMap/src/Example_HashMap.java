import java.util.HashMap;
import java.util.Map;

public class Example_HashMap {
	
	public static void main(String[] args) {
		
		Map<String, String> est = new HashMap<>();
		
		est.put("AC", "Acre");
		est.put("AL", "Alagoas");
		est.put("AP", "Amap�");
		est.put("AM", "Amazonas");
		est.put("BA", "Bahia");
		est.put("CE", "Cear�");
		est.put("DF", "Distrito Federal");
		est.put("ES", "Esp�rito Santo");
		est.put("GO", "Goi�s");
		est.put("MA", "Maranh�o");
		est.put("MT", "Mato Grosso");
		est.put("MS", "Mato Grosso do Sul");
		est.put("MG", "Minas Gerais");
		est.put("PA", "Par�");
		est.put("PB", "Para�ba");
		est.put("PR", "Paran�");
		est.put("PE", "Pernambuco");
		est.put("PI", "Piau�");
		est.put("RJ", "Rio de Janeiro");
		est.put("RN", "Rio Grande do Norte");
		est.put("RS", "Rio Grande do Sul");
		est.put("RO", "Rond�nia");
		est.put("RR", "Roraima");
		est.put("SC", "Santa Catarina");
		est.put("SP", "S�o Paulo");
		est.put("SE", "Sergipe");
		est.put("TO", "Tocantins");
		
		System.out.println(est);
		
		est.remove("MG");
		
		est.put("DF", "Distrito Federal");
		
		System.out.println("Tamanho --> " + est.size());
		
		est.remove("MS","Mato Grosso do Sul");
		
		System.out.println(est.containsValue("Mato Grosso do Sul") ? "Cont�m Valor" : "N�o Cont�m");
		
		// Navegando atrav�s do foreach, dentro de um map
		for (Map.Entry<String, String> entry : est.entrySet()) {
			System.out.println(entry.getValue() + "(" + entry.getKey() + ")");
		}
		
		System.out.println();
		System.out.println(est.containsKey("SC") ? "Cont�m SC" : "N�o cont�m SC");
		
	}

}
