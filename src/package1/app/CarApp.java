package package1.app;

import package1.data.*;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();

        Avanza avanza = new Avanza();
        System.out.println(avanza.getTier());
        avanza.drive();
        System.out.println(avanza.getBrand());
        System.out.println(avanza.isMaintenance());

        Bus bus = new Bus();
        bus.name = "Sugeng Kundur";
        bus.price = 170000000;
        // System.out.println(bus.getBrand());
        // System.out.println(bus.isBig());
        System.out.println(bus);
        System.out.println(bus.hashCode());

        Bus bus2 = new Bus();
        bus2.name = "Sugeng Rahayu";
        bus.price = 180000000;
        // bus2.country = "";
        System.out.println(bus2);
        System.out.println("Hasil Komparasi "+bus.equals(bus2));
        System.out.println(bus2.hashCode() == bus.hashCode());
    }
}
