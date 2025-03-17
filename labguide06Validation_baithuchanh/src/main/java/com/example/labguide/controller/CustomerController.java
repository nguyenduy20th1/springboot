package com.example.labguide.controller;

import com.example.labguide.entity.Customer;
import com.example.labguide.repository.CustomerRepository;
import com.example.labguide.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerService customerService;

    @GetMapping
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customer/list";
    }

    @GetMapping("/new")
    public String createCustomer(Model model) {
        Customer customer = new Customer();
        customer.setIsActive(true);
        model.addAttribute("customer", customer);
        return "customer/form";
    }

    @PostMapping("/save")
    public String saveCustomer(@Validated @ModelAttribute("customer") Customer customer, BindingResult result, Model model) {
        if (customerRepository.existsByUsername(customer.getUsername()) && customer.getId() == null) {
            result.rejectValue("username", "error.customer", "Username đã tồn tại, hãy chọn tên khác");
            return "customer/form";
        }
        if (result.hasErrors()) {
            return "customer/form";
        }
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable Long id, Model model) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id : " + id));
        model.addAttribute("customer", customer);
        return "customer/form";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerRepository.deleteById(id);
        return "redirect:/customers/";
    }
}
