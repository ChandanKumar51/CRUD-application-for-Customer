package com.CRUD.application.repository;

// CustomerRepository.java
import com.CRUD.application.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Custom queries if needed
    List<Customer> findByFirstNameContainingIgnoreCase(String keyword);
}
