import java.util.List;

public class ProductCategory {
    private String key;
    private String name;
    private String slug;
    private String description;
    private String orderHint;

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

    public String getOrderHint() {
        return orderHint;
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

    public void setOrderHint(String orderHint) {
        this.orderHint = orderHint;
    }

}