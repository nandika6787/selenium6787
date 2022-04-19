package mypackage;

public class Mazda implements BrandCar{
     String color = null;
     Integer price = 0;
     Integer vinno = 0;
     String name = "mazda" ;


    @Override
    public String color() {
        return this.color;
    }

    @Override
    public Integer price() {
      //setprice();
        return this.price;
    }


    public String getColor(){return color;}
    public void setcolor(String color) {this.color = color;}

    @Override
    public Integer price(Integer price) {
        setprice(price);
        return this.price;
    }

    public Integer getPrice() {return price;}
    public void setprice(Integer price) {this.price = price;}

    @Override
    public Integer vinno() {
        return this.vinno();
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
