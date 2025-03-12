package com.devmaster.labguide.service;

import com.devmaster.labguide.dto.CustomerDTO;
import com.devmaster.labguide.entity.Customer;
import com.devmaster.labguide.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //lấy ra toàn bộ danh sách
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    //lấy theo id
    public Optional<CustomerDTO> findById(Long id) {
        return customerRepository.findById(id).map(customer -> {
            CustomerDTO customerDTO = new CustomerDTO();
            customerDTO.setId(customer.getId());
            customerDTO.setUsername(customer.getUsername());
            customerDTO.setPassword(customer.getPassword());
            customerDTO.setFullName(customer.getFullName());
            customerDTO.setAddress(customer.getAddress());
            customerDTO.setPhone(customer.getPhone());
            customerDTO.setEmail(customer.getEmail());
            customerDTO.setBirthDay(customer.getBirthDay());
            customerDTO.setActive(customer.isActive());
            return customerDTO;
        });
    }

    public boolean save(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        customer.setUsername(customerDTO.getUsername());
        customer.setPassword(customerDTO.getPassword());
        customer.setFullName(customerDTO.getFullName());
        customer.setAddress(customerDTO.getAddress());
        customer.setPhone(customerDTO.getPhone());
        customer.setEmail(customerDTO.getEmail());
        customer.setBirthDay(customerDTO.getBirthDay());
        customer.setActive(customerDTO.isActive());

        try {
            customerRepository.save(customer);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Customer updateCustomerById(Long id, CustomerDTO updateCustomer) {
        return customerRepository.findById(id).map(customer -> {
            customer.setUsername(updateCustomer.getUsername());
            customer.setPassword(updateCustomer.getPassword());
            customer.setFullName(updateCustomer.getFullName());
            customer.setAddress(updateCustomer.getAddress());
            customer.setPhone(updateCustomer.getPhone());
            customer.setEmail(updateCustomer.getEmail());
            customer.setBirthDay(updateCustomer.getBirthDay());
            customer.setActive(updateCustomer.isActive());
            return customerRepository.save(customer);
        }).orElseThrow(() -> new IllegalArgumentException(("Invalid student ID: " + id)));
    }

    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}
