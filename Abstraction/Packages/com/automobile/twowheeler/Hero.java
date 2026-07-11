package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
    public String getModelName(){
        return "Hero Splender";
    }
    public String getRegistrationNumber(){
        return "AP39AB1234";
    }
    public String getOwnerName(){
        return "Manvitha";
    }
    public int getSpeed(){
        return 70;
    }
    public void radio(){
        System.out.println("Radio is playing..");
    }
}