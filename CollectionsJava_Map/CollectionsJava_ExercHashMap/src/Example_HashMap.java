import java.util.HashMap;
import java.util.Map;

public class Example_HashMap {
	
	public static void main(String[] args) {
		
		Map<String, String> est = new HashMap<>();
		
		est.put("AC", "Acre");
		est.put("AL", "Alagoas");
		est.put("AP", "Amapá");
		est.put("AM", "Amazonas");
		est.put("BA", "Bahia");
		est.put("CE", "Ceará");
		est.put("DF", "Distrito Federal");
		est.put("ES", "Espírito Santo");
		est.put("GO", "Goiás");
		est.put("MA", "Maranhão");
		est.put("MT", "Mato Grosso");
		est.put("MS", "Mato Grosso do Sul");
		est.put("MG", "Minas Gerais");
		est.put("PA", "Pará");
		est.put("PB", "Paraíba");
		est.put("PR", "Paraná");
		est.put("PE", "Pernambuco");
		est.put("PI", "Piauí");
		est.put("RJ", "Rio de Janeiro");
		est.put("RN", "Rio Grande do Norte");
		est.put("RS", "Rio Grande do Sul");
		est.put("RO", "Rondônia");
		est.put("RR", "Roraima");
		est.put("SC", "Santa Catarina");
		est.put("SP", "São Paulo");
		est.put("SE", "Sergipe");
		est.put("TO", "Tocantins");
		
		System.out.println(est);
		
		est.remove("MG");
		
		est.put("DF", "Distrito Federal");
		
		System.out.println("Tamanho --> " + est.size());
		
		est.remove("MS","Mato Grosso do Sul");
		
		System.out.println(est.containsValue("Mato Grosso do Sul") ? "Contém Valor" : "Não Contém");
		
		// Navegando através do foreach, dentro de um map
		for (Map.Entry<String, String> entry : est.entrySet()) {
			System.out.println(entry.getValue() + "(" + entry.getKey() + ")");
		}
		
		System.out.println();
		System.out.println(est.containsKey("SC") ? "Contém SC" : "Não contém SC");
		
	}

}
