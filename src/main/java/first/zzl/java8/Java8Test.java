package first.zzl.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import first.zzl.entity.Property;

public class Java8Test {
	private static List<Property> properties;
	static {
		Property p1 = new Property("叫了个鸡", 1000, 500, 2);
	    Property p2 = new Property("张三丰饺子馆", 2300, 1500, 3);
	    Property p3 = new Property("永和大王", 580, 3000, 1);
	    Property p4 = new Property("肯德基", 6000, 200, 4);
	    properties = Arrays.asList(p1, p2, p3, p4);
	}

	public static void main(String[] args) {
		System.out.println(properties.size());
		String name = properties.stream()
					.sorted(Comparator.comparingInt(x -> x.getDistance()))
					.findFirst()
					.get().getName();
		System.out.println(name);
	}

}
