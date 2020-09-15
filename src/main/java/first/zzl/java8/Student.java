package first.zzl.java8;

import lombok.Data;

@Data
public class Student {
	
	private String name;
	private Integer age;
	private Integer sex; // 1 男 0 女
	
	public Student() {
		
	}
	
	public Student(String name, Integer age, Integer sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
}
