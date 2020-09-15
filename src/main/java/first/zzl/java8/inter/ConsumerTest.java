package first.zzl.java8.inter;

import java.util.function.Consumer;

public class ConsumerTest {
	
	public static void main(String[] args) {
		donation(111, money -> System.out.println("测试 " + money));
	}
	
	public static void donation(Integer money, Consumer<Integer> consumer) {
		consumer.accept(money);
	}
}
