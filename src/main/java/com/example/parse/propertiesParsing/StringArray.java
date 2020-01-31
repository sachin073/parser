package com.example.parse.propertiesParsing;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@ConfigurationProperties("string")
public class StringArray {

    String[] array;

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "StringArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
