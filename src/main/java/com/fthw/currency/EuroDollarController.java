package com.fthw.currency;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EuroDollarController {

    @GetMapping("/eurodollar")
    public double exchange(double euro) {
        return euro * 0.78;
    }
}
