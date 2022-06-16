package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckResponse {
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate TRT;

    @Test
    public void stringCheck() {
        assertEquals("Hello World", TRT.getForObject("http://localhost:" + port + "/", String.class));
    }

}
