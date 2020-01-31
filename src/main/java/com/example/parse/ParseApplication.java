package com.example.parse;

import com.example.parse.propertiesParsing.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ParseApplication.class, args);
	}



	@Autowired
	StringList stringList;

	@Autowired
	StringArray array;
	@Autowired
	StringMap stringMap;

	@Autowired
	Customer customer;

	@Autowired
	CustomerList customerList;

	@Autowired
	CustomerMap customerMap;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(array);

		System.out.println(stringList);

		System.out.println(stringMap);

		System.out.println(customer);

		System.out.println(customerList);

		System.out.println(customerMap);

	}
}
