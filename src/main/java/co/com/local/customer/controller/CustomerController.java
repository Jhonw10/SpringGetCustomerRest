package co.com.local.customer.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.local.customer.dao.CustomerDAO;
import co.com.local.customer.dao.CustomerDAOImpl;
import co.com.local.customer.dto.CustomerDTO;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping(method=RequestMethod.GET)
    public List<CustomerDTO> getAllCustomer() {
    	List<CustomerDTO> listCustomers;
    	CustomerDAO dao;    	
    	dao = new CustomerDAOImpl();
    	listCustomers = dao.getAllCustomers();
    	return listCustomers;
    }
}