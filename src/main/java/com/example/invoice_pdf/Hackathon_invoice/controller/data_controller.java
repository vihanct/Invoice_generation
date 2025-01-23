package com.example.invoice_pdf.Hackathon_invoice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class data_controller {

    @PostMapping("/")
    public String hello(@RequestBody String requestData){
        return String.format("the data is: %s",requestData);
    }

}
