package com.project.shop;

public class OrderFormEntry {
    private Long barcode;
    private int quantity;

    public OrderFormEntry(Long barcode, int quantity) {
        this.barcode = barcode;
        this.quantity = quantity;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
