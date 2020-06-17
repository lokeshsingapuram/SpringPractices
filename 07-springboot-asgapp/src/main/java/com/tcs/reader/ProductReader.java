package com.tcs.reader;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;
@Component
public class ProductReader {

	
public List<String> getProductReaders() throws IOException{
	
List<String> productReaders=Files.lines(Paths.get("src\\main\\resources\\input.txt")).collect(Collectors.toList());
return productReaders;
}
}
