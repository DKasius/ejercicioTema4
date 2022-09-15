package main.Smarts;

public class SmartPhone extends SmartDevice{

    double dimensions;
    String color;


    public SmartPhone(){
    }

    public SmartPhone (String fabricante, String modelo, int year, double dimensions, String color, boolean aquatic, boolean wirelessBatteryCharging){
        super(fabricante, modelo, year, aquatic, wirelessBatteryCharging);
        this.dimensions = dimensions;
        this.color = color;

    }





}
