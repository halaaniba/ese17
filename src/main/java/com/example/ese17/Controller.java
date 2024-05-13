package com.example.ese17;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class Controller {

    @GetMapping("/sum")
    public int sum() {
        Random rand = new Random();
        int num1 = rand.nextInt(4);
        int num2 = rand.nextInt(8);
        return num1 + num2;
    }
}

