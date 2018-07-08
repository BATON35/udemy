package com.konrad.model;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class Customer {
    @NotNull(message = "is required")
    @Size(min = 2, message = " more then two sign")
    public String lastName;
    public String firstName;
    @NotNull(message = "is required")
    @Min(value = 3,message = "at least 3")
    @Max(value = 7, message = "max 7")
    public Integer freePasses;
    @NotNull(message = "is required")
    @Pattern(regexp = "\\d{2}-\\d{3}", message = "proper convention is xx-xxx , x is number from 0-9")
    public String postalCode;

}
