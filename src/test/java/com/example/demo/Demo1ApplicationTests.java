package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Demo1ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void failTest(){
        int a = 1;
        assertEquals(a, 4);
    }

}
