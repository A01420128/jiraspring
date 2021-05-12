package com.example.jirademo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.jirademo.service.OperacionService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class OperacionUnitTest extends JirademoApplicationTests {
    
    @Autowired
    OperacionService operacionService;

    @Test
    public void testSuma() {
        assertEquals(5, operacionService.suma(1, 4));
    }

    @Test
    public void testResta() {
        assertEquals(6, operacionService.resta(8, 2));
    }
}
