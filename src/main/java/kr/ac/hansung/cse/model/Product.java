package kr.ac.hansung.cse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Entity -> 이 내용이 테이블에 만들어짐
//application.propertis에서 create했기 때문
//app이 실행될 때 자동으로 db에 넣어줄 값 data.sql에 정의함
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "productTable")
public class Product implements Serializable {

	/**
	 * 
	 */
	//json을 받아서 view를 생성 / json을 꾸려야하기때문에 Serialization
	private static final long serialVersionUID = 8631137785041881026L;

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "category")
	private String category;

	@Column(name = "price")
	private int price;
	
	@Column(name = "manufacturer")
	private String manufacturer;
	
	@Column(name = "unitInStock")
	private int unitInStock;
	
	@Column(name = "description")
	private String description;
	
	
	public Product(String name, String category, int price, String manufacturer, int unitInStock,
			String description) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.manufacturer = manufacturer;
		this.unitInStock = unitInStock;
		this.description = description;
	}



}