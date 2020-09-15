package first.zzl.java8.inter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
//		int m = 4, n = 4;
//		Integer[][] intss = new Integer[m][n];
//		int temp = 1;
//		
//		for(int i = 0; i< m;i++) {
//			for(int j = 0; j < n ;j++) {
//				intss[i][j] = temp++; 
//			}
//		}
//		
//		for(Integer[] is: intss) {
//			for(Integer i: is) {
//				System.out.print(i + "\t");
//			}
//			System.out.println();
//		}
		List<Integer> list = supply(10, () -> (int)(Math.random() * 100));
		list.forEach(System.out::println);
	}	
	public static List<Integer> supply(Integer num, Supplier<Integer> supplier){
		List<Integer> resultList = new ArrayList<Integer>();
		for(int i = 0;i< num ;i++) {
			resultList.add(supplier.get());
		}
		return resultList;
	}
}
