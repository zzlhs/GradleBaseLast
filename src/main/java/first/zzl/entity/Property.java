package first.zzl.entity;

import lombok.Data;

@Data
public class Property {
	private String name;
	private Integer distance;
	private Integer sales;
	private Integer priceLevel;
	
	public Property(String name, Integer distance, Integer sales, Integer priceLevel) {
		this.name = name;
		this.distance = distance;
		this.sales = sales;
		this.priceLevel = priceLevel;
	}
	
	
	
}
