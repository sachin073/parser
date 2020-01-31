package com.example.parse.propertiesParsing;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("customer.properties")
@ConfigurationProperties("customer")
public class Customer {

    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer {" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
