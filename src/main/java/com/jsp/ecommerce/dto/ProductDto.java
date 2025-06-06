package com.jsp.ecommerce.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
	@Size(min =3 ,max =50,message="*Name should be 3~50 character")
 private String name;
	@Size(min=15,max=100,message="Description should be 15~100 characters")
 private String description;
 private MultipartFile image;
 @Min(value=100,message="Minimum Product Price Should be 100")
 @Max(value=100000,message="Maximun Product Price allowed is 100000")
 private double price;
 @Min(value =1,message="Atleast 1 stock is required")
 @Max(value =100,message="At max 100 stocks are available")
 private int stock;
 @NotEmpty(message ="It is required")
	private String category;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
