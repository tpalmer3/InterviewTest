package com.example.interviewdemo.controller;

import com.example.interviewdemo.controllers.impl.InterviewControllerImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class InterviewControllerImplTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private InterviewControllerImpl controller;

    @Test
    public void testTest1() {
        assertThat(controller).isNotNull();

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/interview/test1",
                String.class)).isEqualTo("{\"message\":\"Hello, World!\",\"code\":200,\"otherCode\":200}");
    }

    @Test
    public void testTest2() {
        assertThat(controller).isNotNull();

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/interview/test2",
                String.class)).isEqualTo("{\"message\":\"Hello, World!\",\"code\":200,\"otherCode\":201}");
    }

    @Test
    public void testTest3() {
        assertThat(controller).isNotNull();

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/interview/test3",
                String.class)).isEqualTo("{\"message\":\"Hello, World!\",\"code\":200,\"otherCode\":200}");
    }

    @Test
    public void testTest4() {
        assertThat(controller).isNotNull();

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/interview/test4",
                String.class)).isEqualTo("{\"message\":\"Hello, World!\",\"code\":200,\"otherCode\":200}");
    }

    @Test
    public void testTest5() {
        assertThat(controller).isNotNull();

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/interview/test5",
                String.class)).isEqualTo("{\"message\":\"Hello, World!\",\"code\":200,\"otherCode\":201}");
    }

    @Test
    public void testTest6() {
        assertThat(controller).isNotNull();

        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/interview/test6?value=HEllo",
                String.class)).isEqualTo("{\"message\":\"Hello, World!\",\"code\":200,\"otherCode\":200}");
    }

}
