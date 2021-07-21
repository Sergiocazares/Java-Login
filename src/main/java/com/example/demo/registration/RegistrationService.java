package com.example.demo.registration;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private EmailValidator emailValidator;

    public String register(RegistrationRequest request){
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalArgumentException("Email not valid");
        }
        return "works";
    }
}
