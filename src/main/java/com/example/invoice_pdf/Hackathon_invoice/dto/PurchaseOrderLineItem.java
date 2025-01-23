package com.example.invoice_pdf.Hackathon_invoice.dto;

import lombok.Data;

@Data
public class PurchaseOrderLineItem {
    String purchaseorderitemid;
    String name;
    Integer quantity;
    Integer price;
}
