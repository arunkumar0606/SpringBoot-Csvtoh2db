package com.example.csvtoh2db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Customer_Details")
public class CustomerDetailsDto {

    @Id
    private int id;

    private String firstName;

    private String lastName;

    private String Company;

    private String City;

}
