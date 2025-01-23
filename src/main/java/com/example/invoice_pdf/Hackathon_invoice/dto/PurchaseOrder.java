package com.example.invoice_pdf.Hackathon_invoice.dto;

import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class PurchaseOrder {
    String PoId;
    Vendor vendor;
    List<PurchaseOrderLineItem> lineItemList;
    HashMap<String,PurchaseOrderLineItem> map;
    HashMap<String,Integer> quantitycheck;


    public boolean QuantityCheck(String item,Integer quantity){
        if(map.get(item).quantity < quantitycheck.get(item) +quantity){
            System.out.println("Received Quantity is more then Purchase Order ask");
            return false;
        }
        quantitycheck.put(item,quantitycheck.get(item)+quantity);
        return true;
    }

//    public boolean CheckStatus(){
//
//    }
}
