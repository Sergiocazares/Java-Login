package com.example.demo.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {

    private final String firstName;
    private final String lastName;
    private String email = null;
    private String password = null;
    public String getLastName;

    public RegistrationRequest(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return null;
    }

    public Object getFirstName() {
        return null;
    }

    public Object getLastName() {
        return null;
    }

    public Object getPassword() {
        return null;
    }
}
