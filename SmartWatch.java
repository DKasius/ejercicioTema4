package main.Smarts;


public class SmartWatch extends SmartDevice {

    String color;
    String gender;
    boolean sport;

    public SmartWatch(){
    }

    public SmartWatch(String fabricante, String modelo, int year, boolean aquatic, boolean wirelessBatteryCharging, String color, String gender, boolean sport){
        super(fabricante, modelo, year, aquatic, wirelessBatteryCharging);
        this.color = color;
        this.gender = gender;
        this.sport = sport;
    }
}
