package com.example.invoice_pdf.Hackathon_invoice.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.*;


@Data
@Getter
@Setter
public class Grn {
    private String GrnId;
    private List<GrnLineitem> Li;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private Vendor vendor;


}
