package package1.data;

public class Pajero implements Car {

    public void drive(){
        System.out.println("Avanza drive");
    }
    public int getTier(){
        return 4;
    }

    public String getBrand(){
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
