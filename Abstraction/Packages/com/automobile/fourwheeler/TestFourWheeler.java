package com.automobile.fourwheeler;
public class TestFourWheeler{
    public static void main(String[] args){
        Logan l = new Logan();
        System.out.println("-----Logan-----");
        System.out.println("Model name: "+l.getModelName());
        System.out.println("Registration Number:"+l.getRegistrationNumber());
        System.out.println("Owner Name: "+l.getOwnerName());
        System.out.println("Speed: "+l.speed()+"km/h");
        System.out.println("GPS status : "+l.gps());
          Ford f = new Ford();
        System.out.println("\n----- Ford -----");
        System.out.println("Model Name : " + f.getModelName());
        System.out.println("Registration Number : " + f.getRegistrationNumber());
        System.out.println("Owner Name : " + f.getOwnerName());
        System.out.println("Speed : " + f.speed() + " km/hr");
        System.out.println("Temperature : " + f.tempControl() + "°C");
    }
}