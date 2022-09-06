package com.Currencies;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currencies")
public class CurrencyValues {
    @Id
    private int currencyCode;

    private String countryName;

    private double exchangeRate;

    public CurrencyValues() {
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public CurrencyValues(int currencyCode, String countryName, double exchangeRate) {
        this.currencyCode = currencyCode;
        this.countryName = countryName;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "CurrencyValues{" +
                "currencyCode=" + currencyCode +
                ", countryName='" + countryName + '\'' +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
