package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.daos.AddressDAO;
import com.engineering.commerce.entities.Address;

public class AddressService {
    
    AddressDAO addressDAO = new AddressDAO();

    AddressService(){

    }
    
    //get all addresses
    public List<Address> getAllAddresses(){
        return addressDAO.getAllAddresses();
    }

    //get address by id
    public Address getAddressById(String Id){
        return addressDAO.getAddressById(Id);
    }

    //add new address
    public void addAddress(Address address){
        addressDAO.addAddress(address);
    }

    //delete address by id
    public void deleteAddress(String Id){
        addressDAO.deleteAddress(Id);
    }
}
