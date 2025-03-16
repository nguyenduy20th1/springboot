package com.example.labguide.service;

import com.example.labguide.entity.Customer;
import com.example.labguide.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Transactional
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Transactional
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id);
    }

    @Transactional
    public Customer saveCustomer(Customer customer) {
        if (customer.getId() == null) {
            return customerRepository.save(customer);
        }
        Customer customer1 = customerRepository.findById(customer.getId()).get();
        customer1.setUsername(customer.getUsername());
        customer1.setPassword(customer.getPassword());
        customer1.setFullName(customer.getFullName());
        customer1.setAddress(customer.getAddress());
        customer1.setPhone(customer.getPhone());
        customer1.setEmail(customer.getEmail());
        customer1.setBirthday(customer.getBirthday());
        customer1.setIsActive(customer.getIsActive());
        return customerRepository.save(customer1);
    }

    @Transactional
    public void deleteCustomer(Customer customer) {
        customerRepository.delete(customer);
    }
}
