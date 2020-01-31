package com.example.parse.propertiesParsing;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@PropertySource("customer.properties")
@ConfigurationProperties("customer-map")
public class CustomerMap {

    Map<String,Customer> map;

    public Map<String, Customer> getMap() {
        return map;
    }

    public void setMap(Map<String, Customer> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Customer Map  {" +
                "map=" + map +
                '}';
    }
}
