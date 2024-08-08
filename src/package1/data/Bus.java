package package1.data;

public class Bus implements Car{
    public String name;
    public int price;
    // final public String country = "Indonesia";

    public void drive(){
        System.out.println("Bus drive");
    }
    public int getTier(){
        return 8;
    }

    public String getBrand(){
        return "Hino";
    }

    public boolean isMaintenance() {
        return true;
    }

    public boolean isBig() {
        return true;
    }

     @Override
     public String toString(){
        return "Bus Name"+ this.name + "with price"+ this.price;
    }

    @Override
    public boolean equals(Object o){

        if (this == o) {
            return true;
        }

        if  ( !(o instanceof Bus )){
            return false;
        }

        Bus bus = (Bus) o;

        if (this.price != bus.price) {
            return false;
        }

        if (this.name != null) {
            return this.name.equals(bus.name);
        }else { 
            return bus.name == null;
        }
    }

    @Override
    public int hashCode(){
        int result = this.name != null ? this.name.hashCode(): 0;
        result = 31* result + this.price;
        return result;
    }

}
