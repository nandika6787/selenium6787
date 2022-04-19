package mypackage;

public class Camera extends Electronics {
    public String brand;
    public Integer price;

    public void photo(){
        //System.out.println


    }
    public void setBrand(String brand){
        this.brand = "Canon";

    }
    public void setPrice(Integer price){
        this.price = 15000;
    }

    public String getBrand() {
        return this.brand;
    }

    public Integer getPrice() {
        return this.price;
    }
}
