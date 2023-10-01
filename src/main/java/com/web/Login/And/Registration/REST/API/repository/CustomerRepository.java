package com.web.Login.And.Registration.REST.API.repository;

import com.web.Login.And.Registration.REST.API.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Optional<Customer> findOneByEmailAndPassword(String email, String password);
    Customer findByEmail(String email);
}
