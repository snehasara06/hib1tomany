package com.kgisl.hibernatemanytoone;

import java.util.List;

public class Owner {
    
    private int ownerId;
    private String ownerName;
    private List<Car> cars;

     //getters and setters

    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public List<Car> getCars() {
        return cars;
    }
    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

   

    
}


