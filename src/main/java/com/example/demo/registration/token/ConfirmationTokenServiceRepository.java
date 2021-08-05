package com.example.demo.registration.token;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfirmationTokenServiceRepository extends JpaRepository<ConfirmationToken, Long> {
}
