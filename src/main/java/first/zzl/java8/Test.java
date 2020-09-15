package first.zzl.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
//		System.out.println("123");
//		List<String> strs = new ArrayList<String>() {
//			{
//				add("aaa");
//				add("bbb");
//				add("ccc");
//			}
//		};
//		strs.forEach((str) -> {
//			System.out.println(str);
//		});
		
		Student stu1 = new Student("zzl1", 11, 1);
		Student stu2 = new Student("zzl2", 111, 1);
		Student stu3 = new Student("zzl3", 1111, 1);

		List<Student> list = Arrays.asList(stu1, stu2, stu3);
		System.out.println(list.get(0).getName());
		System.out.println("排序后-------------------------------------");

//		Collections.sort(list, (x, y) -> x.getAge().compareTo(y.getAge()));
//		System.out.println(list.get(0).getName());
		System.out.println("java8后-----------------------------------");
		
		String name = list.stream()
							.sorted(Comparator.comparing(x -> x.getAge()))
							.findFirst()
							.get().getName();
		System.out.println(name);
		System.out.println("java8后统计-----------------------------");
		long count = list.stream()
							.filter(s -> s.getAge() >= 100 )
							.count();
		System.out.println("s.getAge() >= 100 " + count);
	}

}
