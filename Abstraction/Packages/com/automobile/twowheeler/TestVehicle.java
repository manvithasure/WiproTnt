package com.automobile.twowheeler;
public class TestVehicle{
    public static void main(String[] args){
        Hero h = new Hero();
        System.out.println("Model name: "+h.getModelName());
        System.out.println("Registration No: "+h.getRegistrationNumber());
        System.out.println("Owner Name: "+h.getOwnerName());
        System.out.println("Speed: "+h.getSpeed());
        h.radio();   
    }
}