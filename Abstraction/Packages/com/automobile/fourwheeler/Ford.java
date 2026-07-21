package com.automobile.fourwheeler;
import com.automobile.Vehicle;
public class Ford extends Vehicle{
    public String getModelName(){
        return "Ford";
    }
    public String getRegistrationNumber() {
        return "AP39CD2222";
    }

    public String getOwnerName() {
        return "Anand";
    }

    public int speed() {
        return 100;
    }
     public int tempControl() {
        return 22;
    }
}