import java.time.ZonedDateTime;
import java.util.List;
//TODO get set

public class Customer {
    private ZonedDateTime lastModifiedAt;
    private ZonedDateTime createdAt;
    private ClientInfo lastModifiedBy;
    private ClientInfo createdBy;
    private Reference invReference;
    private String email;
    private String firstName;
    private String lastName;
    private String companyName;
    private List<Address> addresses;
    private List<String> shippingAddressIds; //opcional
    private List<String> billingAddressIds; //opcional
    private String customerNumber;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class ClientInfo {
        private String clientId;
    
    }
    
    public static class Reference {
        private String id;
    
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
}

