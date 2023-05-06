package com.ust.proper.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EmployeeDto {

    @NotNull(message = "cannot be null")
    private String name;
    @Email(message = "cannot be null")
    private String email;

    private String phno;

    public EmployeeDto(String name, String email, String phno) {
        this.name = name;
        this.email = email;
        this.phno = phno;
    }
    public EmployeeDto()
    {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}
