package com.nutdanai.zoo;

/**
 * Created by Nutdanai on 7/12/2016.
 */
public class Price {
    private String clientType;
    private int priceType;

    public Price(String clientType, int priceType) {
        this.clientType = clientType;
        this.priceType = priceType;
    }

    public String getClientType() { return clientType; }
    public int getPriceType() { return priceType; }
}
