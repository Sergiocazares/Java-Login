package com.example.demo.appuser;


import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface StudentRepository {
}
