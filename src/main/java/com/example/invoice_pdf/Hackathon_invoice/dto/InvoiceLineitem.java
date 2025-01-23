package com.example.invoice_pdf.Hackathon_invoice.dto;


import lombok.Data;

@Data
public class InvoiceLineitem {
    String invoiceitemid;
    PurchaseOrder po;
    Grn grn;
    PurchaseOrderLineItem purchaseorderlineitem;
    Integer quantity;
}
