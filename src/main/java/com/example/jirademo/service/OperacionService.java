package com.example.jirademo.service;

import org.springframework.stereotype.Service;

@Service
public class OperacionService {
    
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }
}
