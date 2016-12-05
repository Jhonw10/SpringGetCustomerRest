package co.com.local.customer.dto;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerDTOTest {
	
	@Test
	public void testValidateInstanceNotNullValid(){
		CustomerDTO dataIn;
		String name;
		dataIn = new CustomerDTO();		
		dataIn.setName("Jhon");
		name = dataIn.getName();
		
		assertEquals("Jhon", name);			
	}

}
