package com.engineering.commerce.services;

import java.util.List;

import com.engineering.commerce.daos.PriceDAO;
import com.engineering.commerce.entities.Price;

public class PriceService {

    private PriceDAO priceDAO;

    public void PriceService(){
        // priceDAO = new PriceDAO(true);
    }

    public List<Price> getAllPrices(){
        return priceDAO.getAllPrices();
    }

    public void addPrice(Price price){
        priceDAO.addPrice(price);
    }

    public Price getPricebyId(String Id){
        return priceDAO.getPricebyId(Id);
    }

    public void deletePrice(String Id){
        priceDAO.deletePrice(Id);
    }
}
