package com.example.parse.propertiesParsing;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("customer.properties")
@ConfigurationProperties("customer-list")
public class CustomerList {

    List<Customer> list;

    public List<Customer> getList() {
        return list;
    }

    public void setList(List<Customer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "customer List {" + list +
                '}';
    }
}
