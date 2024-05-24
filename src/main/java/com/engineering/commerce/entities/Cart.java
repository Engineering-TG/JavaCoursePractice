import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

//TODO get set

public class Cart {
    private String id;
    private ZonedDateTime lastModifiedAt;
    private ClientReference lastModifiedBy;
    private ClientReference createdBy;
    private String customerId;
    private String customerEmail;
    private List<CartDiscountInfo> discountInfo;
    private List<LineItem> lineItems;
    private PaymentInfo paymentInfo;
    private Address shippingAddress;
    private Address billingAddress;
    private String cartState;
    private ItemShippingAddresses itemShippingAddresses;


    public static class ClientReference {
        private String clientId;
        private boolean isPlatformClient;
    
    }
    
    public static class Reference {
        private String typeId;
        private String id;
    
    }
    
    public static class CartDiscountInfo {
        private String discountCode;
        private Reference discountedLineItemPortion;
    
    }
    
    public static class Money { //opcional
        private String currencyCode;
        private long centAmount;
    
    }
    
    public static class LineItem {
        private String id;
        private String productId;
        private String name;
        private String productSlug;
        private Reference variant;
        private int quantity;
        private Money price;
        private Money totalPrice;
        private List<Reference> itemState;
    
    }
    public static class PaymentInfo { //opcional
        private List<Reference> payments;
    
    }
    
    public static class ShippingInfo {
        private ShippingRate shippingRate;
        private Reference shippingMethodState;
    
    }
    
    public static class ShippingRate { //opcional
        private String id;
        private String name;
        private Money price;
        private Reference shippingRateInput;
    
    }
    
    public static class ItemShippingAddresses {//opcional shipping per item
        private Map<String, Address> addressesPerLineItem;
    
    }
    
    public static class Address {
        private String id;
        private String firstName;
        private String lastName;
        private String streetName;
        private String postalCode;
        private String city;
        private String state;
        private String country;
        private String phone;
        private String email;
    
    }
    
    public static class PaymentMethodInfo {
        private String paymentInterface;
        private String method;
        private String paymentProvider;
    
    }

}

