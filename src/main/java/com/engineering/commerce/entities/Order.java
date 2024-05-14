package com.engineering.commerce.entities;

import java.time.ZonedDateTime;
import java.util.List;

public class Order {
    private String id;
    private ZonedDateTime createdAt;
    private ZonedDateTime lastModifiedAt;
    private UserReference createdBy;
    private UserReference lastModifiedBy;
    private Money totalPrice; //opcional
    private String orderState;
    private Reference shippingAddress;
    private List<LineItem> lineItems;
    private String customerId;
    private String customerEmail;
    private Reference Cart;

    // Getters and setters
    // ...

    public static class UserReference {
        private String clientUserId;
        private String clientId;
    
        // Getters and setters
        // ...
    }
    
    public static class Money { //opcional
        private String type;
        private String currencyCode;
        private long centAmount;
        private int fractionDigits;
    
        // Getters and setters
        // ...
    }
    
    public static class Reference {
        private String typeId;
        private String id;
    
        // Getters and setters
        // ...
    }
    
    public static class LineItem {
        private String id;
        private String productId;
        private String name;
        private String productSlug;
        private ProductVariant variant;
        private Money price;
        private Money totalPrice;
        private int quantity;
        private List<StateInfo> state;//opcional
        // Getters and setters
        // ...
    }
    
    public static class ProductVariant {
        private int id;
        private String sku;
        private String key;
        private List<Price> prices;
        private List<Image> images;
    
        // Getters and setters
        // ...
    }
    
    public static class Price {
        private Money value;
        private String id;
    
        // Getters and setters
        // ...
    }
    
    public static class Image { //opcional
        private String url;
        private Dimensions dimensions;
    
        // Getters and setters
        // ...
    }
    
    public static class Dimensions { //opcional
        private int w;
        private int h;
    
        // Getters and setters
        // ...
    }
    
    public static class StateInfo {//opcional
        private int quantity;
        private Reference state;
    
        // Getters and setters
        // ...
    }
}

