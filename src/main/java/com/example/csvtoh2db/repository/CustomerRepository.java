package com.example.csvtoh2db.repository;

import com.example.csvtoh2db.model.CustomerDetailsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerDetailsDto, Integer> {
}
