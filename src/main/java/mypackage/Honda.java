package mypackage;

public class Honda implements BrandCar {

    String color = null;
    Integer price = 0;
    Integer vinno = 0;

    String name = "Honda" ;



    @Override
    public String color() {
        return this.color;

    }

    @Override
    public Integer price() {
        return this.price;
    }

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}


    @Override
    public Integer price(Integer price){
        setPrice(price);

        return this.price;

    }
    public Integer getPrice() {return price;}

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer vinno(Integer vinno){
        return this.vinno();
    }

    @Override
    public Integer vinno() {
        return null;
    }

    @Override
    public String name() {
        return this.name;
    }

    public Integer getVinno() {
        return vinno;
    }

    public void setVinno(Integer vinno) {
        this.vinno = vinno;
    }
}
