package org.example.task3;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    private String name;
    private String description;

    public Company(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
