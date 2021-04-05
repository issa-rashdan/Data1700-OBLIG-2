package com.example.demo;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class billettController {

    private final List<Billett> billetter = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreBillett(Billett innBillett) {
        billetter.add(innBillett);
    }

    @GetMapping("/hentAlle")
    public List<Billett> hentAlle() {
        return billetter;
    }

    @GetMapping("/nullstill")
    public void nullstill() {
        billetter.clear();
    }
}

