package model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private String item;
	private Integer price;
}

//product和order的資料不能擺在一起,因為product會一直改變 
