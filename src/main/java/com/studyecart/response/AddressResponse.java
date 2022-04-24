package com.studyecart.response;

import com.studyecart.entity.*;
public class AddressResponse {

    private String street;

    private String city;
    private long addressId;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }


    public AddressResponse(Address  address) {
        this.addressId = address.getId();
        this.street=address.getStreet();
        this.city=address.getCity();
    }
}
