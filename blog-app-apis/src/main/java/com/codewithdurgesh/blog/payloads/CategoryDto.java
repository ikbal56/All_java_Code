package com.codewithdurgesh.blog.payloads;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	
	private Integer  categoryId;
	
	@NotNull
	@Size(min=3,message="Minimum character of categoryTitle is 4")
	private String categoryTitle;
	
	@NotNull
	@Size(min=10,message="Minimum char of category of desc is 10")
	private String categoryDescription;
	

}
