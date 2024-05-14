package com.engineering.commerce.entities;

import java.util.List;

public class MasterVariant {
        private String sku;
        private List<Price> prices;
        private List<Image> images;

        public String getSku() {
            return sku;
        }

        public List<Price> getPrices() {
            return prices;
        }

        public List<Image> getImages() {
            return images;
        }

        public void setSku(String sku) {
            this.sku = sku;
        }

        public void setPrices(List<Price> prices) {
            this.prices = prices;
        }

        public void setImages(List<Image> images) {
            this.images = images;
        }
    }