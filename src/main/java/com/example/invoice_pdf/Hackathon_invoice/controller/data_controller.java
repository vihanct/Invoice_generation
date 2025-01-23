package com.example.invoice_pdf.Hackathon_invoice.controller;

import com.example.invoice_pdf.Hackathon_invoice.dto.Grn;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

@Data
@RestController
@RequestMapping("/api/grn")
public class data_controller {

    @PostMapping("")
    public void grnAPI(@RequestBody Grn grn){
        System.out.println("Received GRN object: " + grn);

        // Example: Print details
        System.out.println("GRN ID: " + grn.getGrnId());
        System.out.println("Vendor: " + grn.getVendor().getVendorName());
        System.out.println("Line Items: " + grn.getLi());
    }



}
