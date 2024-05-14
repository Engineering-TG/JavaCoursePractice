package com.engineering.commerce.entities;

import java.time.ZonedDateTime;

public class InventoryEntry {
    private String sku;
    private long quantityOnStock;
    private int restockableInDays;
    private ZonedDateTime expectedDelivery;

    public String getSku() {
        return sku;
    }

    public long getQuantityOnStock() {
        return quantityOnStock;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public int getRestockableInDays() {
        return restockableInDays;
    }

    public void setExpectedDelivery(ZonedDateTime expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public void setQuantityOnStock(long quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }

    public void setRestockableInDays(int restockableInDays) {
        this.restockableInDays = restockableInDays;
    }

    public ZonedDateTime getExpectedDelivery() {
        return expectedDelivery;
    }

}