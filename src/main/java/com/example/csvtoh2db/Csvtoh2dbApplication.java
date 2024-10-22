package com.example.csvtoh2db;

import com.example.csvtoh2db.service.CsvToH2dbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Csvtoh2dbApplication {


	public static void main(String[] args) {

		SpringApplication.run(Csvtoh2dbApplication.class, args);
		System.out.println("Hello");
//		CsvToH2dbService csv=new CsvToH2dbService();
//		csv.init();
	}

}
