package com.konrad.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class Client {
    @NotNull(message = "is required")
    @Size(min = 1)
    public String firstName;
    public String lastName;

}
