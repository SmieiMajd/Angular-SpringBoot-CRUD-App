package com.Project.SpringAngular.Service;

import com.Project.SpringAngular.DTO.CustomerDTO;
import com.Project.SpringAngular.DTO.CustomerSaveDTO;
import com.Project.SpringAngular.DTO.CustomerUpdateDTO;

import java.util.List;

public interface CustomerService {
    String addCustomer(CustomerSaveDTO customerSaveDTO);

    List<CustomerDTO> getAllCustomer();

    Integer updateCustomers(Integer Id, CustomerUpdateDTO customerUpdateDTO);

    boolean deleteCustomer(int id);
}