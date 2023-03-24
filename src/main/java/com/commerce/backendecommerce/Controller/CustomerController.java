package com.commerce.backendecommerce.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.commerce.backendecommerce.Model.Customer;
import com.commerce.backendecommerce.Service.CustomerService;

// import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
// @CrossOrigin("http://localhost:3000")
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer) {
        customerService.registerCustomer(customer);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    };

}
