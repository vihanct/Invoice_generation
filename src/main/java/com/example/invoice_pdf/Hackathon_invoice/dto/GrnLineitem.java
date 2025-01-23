package com.example.invoice_pdf.Hackathon_invoice.dto;

import lombok.Data;

@Data
public class GrnLineitem {
    String grnitemid;
    String PoId;
    String purchaseorderitemid;
    Integer quantity;
}
