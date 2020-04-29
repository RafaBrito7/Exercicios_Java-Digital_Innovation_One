import java.util.Comparator;

public class OrderComparable implements Comparator<Pessoa> {

	@Override
	public int compare(Pessoa o1, Pessoa o2) {
		
		return o1.getAge() - o2.getAge();
	}

	
}
