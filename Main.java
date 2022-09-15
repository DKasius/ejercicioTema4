package main.Smarts;

public class Main {

    public static void main(String[] args) {

        SmartDevice tablet = new SmartDevice("Janda", "Xpro", 2022, false, true);

        System.out.println("TABLET JANDA XPRO");

        System.out.println("El fabricante es " + tablet.manufacturer);
        System.out.println("El modelo " + tablet.model);
        System.out.println("El año de fabricación es " + tablet.year);
        System.out.println("Es acuático? " + tablet.aquatic);
        System.out.println("Carga la batería inalámbricamente? " + tablet.wirelessBatteryCharging);


        SmartPhone phone = new SmartPhone("Janda", "Xs", 2021, 25.2*10.5, "plateado", false, true);

        System.out.println("SMARTPHONE JANDA XS");

        System.out.println("El fabricante es " + phone.manufacturer);
        System.out.println("El modelo " + phone.model);
        System.out.println("El año de fabricación es " + phone.year);
        System.out.println("Sus dimensiones son " + phone.dimensions);
        System.out.println("Es de color " + phone.color);
        System.out.println("Es acuático? " + phone.aquatic);
        System.out.println("Carga la batería inalámbricamente? " + phone.wirelessBatteryCharging);

        SmartWatch watch = new SmartWatch("Janda", "FreeSport", 2022, true, false, "verde", "masculino", true);

        System.out.println("RELOJ JANDA FREESPORT");

        System.out.println("El fabricante es " + watch.manufacturer);
        System.out.println("El modelo " + watch.model);
        System.out.println("El año de fabricación es " + watch.year);
        System.out.println("Es acuático? " + watch.aquatic);
        System.out.println("Carga la batería inalámbricamente? " + watch.wirelessBatteryCharging);
        System.out.println("Es de color " + watch.color);
        System.out.println("Es para género " + watch.gender);
        System.out.println("Se puede usar para hacer deporte? " + watch.sport);








    }
}
