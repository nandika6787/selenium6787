package mypackage;

public class AmexCard implements Card {

    Integer bal =0;

    String name = null ;
    Integer number =0;
    @Override
    public Integer balance(Integer bal) {

        setBal(bal);
        return this.bal;
    }

    @Override
    public String name() {
        return this.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public Integer number() {
        return number;

    }

    @Override
    public Integer getBal() {
        return bal;
    }

    public void setBal(Integer bal) {
        this.bal = bal;
    }
}
