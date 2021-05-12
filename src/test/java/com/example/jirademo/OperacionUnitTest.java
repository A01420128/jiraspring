package com.example.jirademo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.jirademo.service.OperacionService;

import org.springframework.beans.factory.annotation.Autowired;

public class OperacionUnitTest extends JirademoApplicationTests {
    
    @Autowired
    OperacionService operacionService;

    @Test
    public void testSuma() {
        assertEquals(5, operacionService.suma(1, 4));
    }
}
