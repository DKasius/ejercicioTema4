package main.Smarts;

public class SmartDevice {

    protected String manufacturer;
    protected String model;
    protected int year;
    protected boolean aquatic;
    protected boolean wirelessBatteryCharging;

    public SmartDevice(){
    }

    public SmartDevice(String fabricante, String modelo, int year, boolean aquatic, boolean wirelessBatteryCharging) {
        this.manufacturer = fabricante;
        this.model = modelo;
        this.year = year;
        this.aquatic = aquatic;
        this.wirelessBatteryCharging = wirelessBatteryCharging;
    }




}
