package com.engineering.commerce.daos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


import com.engineering.commerce.entities.Address;
import com.google.gson.Gson;

public class AddressDAO {

    private List<Address> addresses = new ArrayList<>();
    
    public AddressDAO(){
        
    }

    public AddressDAO(boolean init){
        if(init){
            this.initPrices();
        }
    }

    // loads addresses from json
    public void initPrices(){
                try (Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/addresses.json"))) {
			Collections.addAll(addresses, new Gson().fromJson(reader, Address[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    //get all addresses
    public List<Address> getAllAddresses(){
        return addresses;
    }

    //get address by id
    public Address getAddressById(String Id){
        Optional<Address> selectedAddress = addresses.stream().filter(a -> a.getId().equals(Id)).findFirst();

        return selectedAddress.orElse(null);
    }

    //add new address
    public void addAddress(Address address){
        addresses.add(address);
    }

    //delete address by id
    public void deleteAddress(String Id){
        addresses.removeIf(a -> a.getId().equals(Id));
    }
}
