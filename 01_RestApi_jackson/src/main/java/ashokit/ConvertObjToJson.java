package ashokit;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertObjToJson {
	public static void main(String[] args) throws Exception {
Customer c = new Customer(101, "Ashok", "Ashok@gmail.com");
	ObjectMapper mapper = new ObjectMapper();
	mapper.writeValue(new File("customer.json"), c);
	System.out.println("Completed.....!");
	}
}
