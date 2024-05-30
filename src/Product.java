import java.util.List;

public class Product {
    private String key;
    private LocalizedString name;
    private LocalizedString slug;
    private ProductType productType;
    private MasterVariant masterVariant;
    private List<ProductCategory> categories;
    private ProductState state;
    private boolean publish;

    public String getKey() {
        return key;
    }

    public LocalizedString getName() {
        return name;
    }

    public LocalizedString getSlug() {
        return slug;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ProductType getProductType() {
        return productType;
    }

    public MasterVariant getMasterVariant() {
        return masterVariant;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public ProductState getState() {
        return state;
    }

    public boolean isPublish() {
        return publish;
    }

    public void setName(LocalizedString name) {
        this.name = name;
    }

    public void setSlug(LocalizedString slug) {
        this.slug = slug;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public void setMasterVariant(MasterVariant masterVariant) {
        this.masterVariant = masterVariant;
    }

    public void setCategories(List<ProductCategory> categories) {
        this.categories = categories;
    }

    public void setState(ProductState state) {
        this.state = state;
    }

    public void setPublish(boolean publish) {
        this.publish = publish;
    }

    public static class LocalizedString {
        private String en;

        public String getEn() {
            return en;
        }

        public void setEn(String en) {
            this.en = en;
        }
    }

    public static class ProductType {
        private String typeId;
        private String id;

        public String getTypeId() {
            return typeId;
        }

        public String getId() {
            return id;
        }

        public void setTypeId(String typeId) {
            this.typeId = typeId;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class MasterVariant {
        private String sku;
        private List<Price> prices;

        public String getSku() {
            return sku;
        }

        public List<Price> getPrices() {
            return prices;
        }


        public void setSku(String sku) {
            this.sku = sku;
        }

        public void setPrices(List<Price> prices) {
            this.prices = prices;
        }

        public static class Price {
            private PriceValue value;

            public PriceValue getValue() {
                return value;
            }

            public void setValue(PriceValue value) {
                this.value = value;
            }

            public static class PriceValue {
                private String currencyCode;
                private long centAmount;

                public String getCurrencyCode() {
                    return currencyCode;
                }

                public long getCentAmount() {
                    return centAmount;
                }

                public void setCurrencyCode(String currencyCode) {
                    this.currencyCode = currencyCode;
                }

                public void setCentAmount(long centAmount) {
                    this.centAmount = centAmount;
                }
            }
        }
    }

    public static class ProductCategory {
        private String typeId;
        private String id;

        public String getTypeId() {
            return typeId;
        }

        public String getId() {
            return id;
        }

        public void setTypeId(String typeId) {
            this.typeId = typeId;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public static class ProductState {
        private boolean initial;

        public boolean isInitial() {
            return initial;
        }

        public void setInitial(boolean initial) {
            this.initial = initial;
        }
    }
}