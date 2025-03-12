package com.devmaster.labguide.controller;

import com.devmaster.labguide.dto.CustomerDTO;
import com.devmaster.labguide.entity.Customer;
import com.devmaster.labguide.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.findAll());
        return "customer-list";
    }

    @GetMapping("/add-new")
    public String addCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-add";
    }

    @GetMapping("/edit/{id}")
    public String showForm(@PathVariable(value = "id") Long id, Model model) {
        CustomerDTO customer = customerService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid customer ID: " + id));
        model.addAttribute("customer", customer);
        return "customer-edit";
    }


    @PostMapping
    public String saveCustomer(@ModelAttribute("customer") CustomerDTO customer) {
        customerService.save(customer);
        return "redirect:/customers";
    }

    @PostMapping("/update/{id}")
    public String updateCustomer(@PathVariable(value = "id") Long id ,@ModelAttribute("customer") CustomerDTO customer) {
        customerService.updateCustomerById(id, customer);
        return "redirect:/customers";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable(value = "id") Long id) {
        customerService.deleteById(id);
        return "redirect:/customers";
    }
}
