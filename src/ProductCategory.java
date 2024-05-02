import java.util.List;

public class ProductCategory {
    private String key;
    private LocalizedString name;
    private LocalizedString slug;
    private LocalizedString description;
    private List<ProductCategoryReference> ancestors;
    private String orderHint;
    private String externalId;
    private LocalizedString metaTitle;
    private LocalizedString metaDescription;
    private LocalizedString metaKeywords;
    private List<Asset> assets;

    public String getKey() {
        return key;
    }

    public LocalizedString getName() {
        return name;
    }

    public LocalizedString getSlug() {
        return slug;
    }

    public LocalizedString getDescription() {
        return description;
    }

    public List<ProductCategoryReference> getAncestors() {
        return ancestors;
    }

    public String getOrderHint() {
        return orderHint;
    }

    public String getExternalId() {
        return externalId;
    }

    public LocalizedString getMetaTitle() {
        return metaTitle;
    }

    public LocalizedString getMetaDescription() {
        return metaDescription;
    }

    public LocalizedString getMetaKeywords() {
        return metaKeywords;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(LocalizedString name) {
        this.name = name;
    }

    public void setSlug(LocalizedString slug) {
        this.slug = slug;
    }

    public void setDescription(LocalizedString description) {
        this.description = description;
    }

    public void setAncestors(List<ProductCategoryReference> ancestors) {
        this.ancestors = ancestors;
    }

    public void setOrderHint(String orderHint) {
        this.orderHint = orderHint;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public void setMetaTitle(LocalizedString metaTitle) {
        this.metaTitle = metaTitle;
    }

    public void setMetaDescription(LocalizedString metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setMetaKeywords(LocalizedString metaKeywords) {
        this.metaKeywords = metaKeywords;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
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

    public static class ProductCategoryReference {
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

    public static class Asset {
        private String key;
        private List<Source> sources;

        public String getKey() {
            return key;
        }

        public List<Source> getSources() {
            return sources;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public void setSources(List<Source> sources) {
            this.sources = sources;
        }

        public static class Source {
            private String uri;

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }
        }
    }
}