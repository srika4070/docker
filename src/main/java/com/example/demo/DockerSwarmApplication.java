package com.example.demo;

import java.util.Random;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class DockerSwarmApplication {
public static void main(String[] args) {
SpringApplication.run(DockerSwarmApplication.class, args);
}
}
