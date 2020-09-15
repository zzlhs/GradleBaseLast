package first.zzl.java8.inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("zzl1", "zzzzzzz", "erewrewr", "vbhbdfg");
		List<String> filteredList = filter(list, (f) -> f.length() > 4);
		System.out.println(filteredList);
	}
	
	public static List<String> filter(List<String> fruit, Predicate<String> predicate){
		List<String> f = new ArrayList<String>();
		for(String s: fruit) {
			if(predicate.test(s)) {
				f.add(s);
			}
		}
		return f;
	}

}
