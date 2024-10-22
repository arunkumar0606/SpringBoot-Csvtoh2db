package com.example.csvtoh2db.service;

import com.example.csvtoh2db.model.CustomerDetailsDto;
import com.example.csvtoh2db.repository.CustomerRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class CsvToH2dbService {

    @Autowired
    CustomerRepository customerRepository;

    @PostConstruct
    public void init(){
        String csvFile = "C:\\Users\\ASUS\\Downloads\\customersfile.csv";
        String line;
        String csvSeparator = ",";
        int count=0;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                count+=1;
                // Split the line into columns using the CSV separator
                String[] columns = line.split(csvSeparator);

                CustomerDetailsDto customerDetailsDto=new CustomerDetailsDto();
                customerDetailsDto.setId(Integer.parseInt(columns[0].strip()));
                customerDetailsDto.setCity(columns[5]);
                customerDetailsDto.setCompany(columns[4]);
                customerDetailsDto.setFirstName(columns[2]);
                customerDetailsDto.setLastName(columns[3]);
                customerRepository.save(customerDetailsDto);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total Records Written : "+count);
    }
    }


