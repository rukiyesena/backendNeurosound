package com.example.template.model.db.master;

import com.example.template.model.db.RefObject;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Inventory extends RefObject {
    private String inventoryCode;
    private String inventoryName;
    private String inventoryPrice;

    public Inventory(String inventoryCode, String inventoryName, String inventoryPrice) {
        this.inventoryCode = inventoryCode;
        this.inventoryName = inventoryName;
        this.inventoryPrice = inventoryPrice;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void setInventoryCode(String inventoryCode) {
        this.inventoryCode = inventoryCode;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getInventoryPrice() {
        return inventoryPrice;
    }

    public void setInventoryPrice(String inventoryPrice) {
        this.inventoryPrice = inventoryPrice;
    }

    public Inventory() {
    }
}
