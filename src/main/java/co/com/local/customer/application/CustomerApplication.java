package co.com.local.customer.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("co.com.local")
public class CustomerApplication {

    public static void main(String[] args) {
    	SpringApplication.run(CustomerApplication.class, args);
    }    
}
