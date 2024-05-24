import java.util.List;

public class ProductCategory {
    private String key;
    private String name;
    private String slug;
    private String description;
    private List<ProductCategoryReference> ancestors; //sub categorias
    private String orderHint;
    private List<Asset> assets;

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getDescription() {
        return description;
    }

    public List<ProductCategoryReference> getAncestors() {
        return ancestors;
    }

    public String getOrderHint() {
        return orderHint;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAncestors(List<ProductCategoryReference> ancestors) {
        this.ancestors = ancestors;
    }

    public void setOrderHint(String orderHint) {
        this.orderHint = orderHint;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
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