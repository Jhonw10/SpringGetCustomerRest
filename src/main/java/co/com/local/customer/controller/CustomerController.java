package co.com.local.customer.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.local.customer.dto.CustomerDTO;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(method=RequestMethod.GET)
    public List<CustomerDTO> getAllCustomer() {
    	List<CustomerDTO> listCustomers;
    	CustomerDTO customer;		
    	
    	listCustomers = new ArrayList<CustomerDTO>();
	    customer = new CustomerDTO(counter.incrementAndGet(),
	        					"CC","1017183","Jhon Olarte");
    	listCustomers.add(customer);
    	return listCustomers;
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public CustomerDTO getCustomerWithId(@PathVariable Long id) {
        if(id == 1){
	    	return new CustomerDTO(counter.incrementAndGet(),
	        					"CC","1017183","Jhon Olarte");
        }
        return null;
    }
}