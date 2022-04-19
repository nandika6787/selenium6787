package mypackage;

public class Car {
    public Integer tire;
    public String brand;
    public String booking(){
        return "done";

    }

    public void setBrand(String brand) {
        this.brand = "Mazda";

    }

    public void setTire(Integer tire) {
        this.tire = 4;

    }

    public String getBrand() {
        return this.brand;
    }
    public Integer getTire() {
        return this.tire;
    }

}

