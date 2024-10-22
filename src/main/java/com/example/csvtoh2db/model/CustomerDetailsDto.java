package com.example.csvtoh2db.model;

import lombok.Data;

@Data
public class CustomerDetailsDto {

    private int id;

    private String firstName;

    private String lastName;

    private String Company;

    private String City;

}
