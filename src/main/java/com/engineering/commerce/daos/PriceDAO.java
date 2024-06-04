package com.engineering.commerce.daos;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


import com.engineering.commerce.entities.Price;
import com.google.gson.Gson;

public class PriceDAO {

    private List<Price> prices = new ArrayList<Price>();

    public PriceDAO(){

    }

    public PriceDAO(Boolean init){
        if(init){
            this.initPrices();
        }
    }


    //loads prices from json into DAO
    private void initPrices(){
        try (Reader reader = new InputStreamReader(this.getClass().getResourceAsStream("/prices.json"))) {
			Collections.addAll(prices, new Gson().fromJson(reader, Price[].class));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    //returns all prices
    public List<Price> getAllPrices(){
        return prices;
    }

    //add new price
    public void addPrice(Price price){
        prices.add(price);
    }

    //returns price via ID
    public Price getPricebyId(String Id){

        Optional<Price> selectedPrice = prices.stream().filter(p -> p.getId().equals(Id)).findFirst();

        return selectedPrice.orElse(null);
    }

    //deltes price based on id
    public void deletePrice(String Id){
        prices.removeIf(p -> p.getId().equals(Id));
    }
}