package com.tcs.writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductWriter {
	
	public List<String> saveProduct(List<String> productList){
		
		try {
			Files.write(Paths.get("src\\main\\resources\\output.txt"),productList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return productList;
		
		
		
		
	}

}
