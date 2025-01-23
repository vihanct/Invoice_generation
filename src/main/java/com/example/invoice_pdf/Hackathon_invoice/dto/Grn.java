package com.example.invoice_pdf.Hackathon_invoice.dto;

import java.time.LocalDateTime;
import java.util.*;

public class Grn {
    private String GRNId;
    private String PoID;
    private List<GrnLineitem> Li;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private Vendor vendor;

    public Grn(){

    }
}
