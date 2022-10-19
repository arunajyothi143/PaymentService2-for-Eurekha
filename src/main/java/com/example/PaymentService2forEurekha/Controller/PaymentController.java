package com.example.PaymentService2forEurekha.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

    @GetMapping("/payNow/{price}")
    public String payNow(@PathVariable String price){
        return "payment amount" + price + "is successfull";
    }
}
