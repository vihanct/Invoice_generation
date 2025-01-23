package com.example.invoice_pdf.Hackathon_invoice.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.*;

@Data
public class Grn {
    private String GRNId;
    private List<GrnLineitem> Li;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private Vendor vendor;


}
