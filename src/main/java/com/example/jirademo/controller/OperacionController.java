package com.example.jirademo.controller;

import com.example.jirademo.model.OperacionRequest;
import com.example.jirademo.service.OperacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/operacion")
public class OperacionController {

    @Autowired
    OperacionService operacionService;

    @PostMapping("/suma")
    public double sumar(@RequestBody OperacionRequest operacionRequest) {
        return operacionService.suma(operacionRequest.getA(), operacionRequest.getB());
    }

    @PostMapping("/resta")
    public double restar(@RequestBody OperacionRequest operacionRequest) {
        return operacionService.resta(operacionRequest.getA(), operacionRequest.getB());
    }
    
}
