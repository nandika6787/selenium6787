package mypackage;

public class Closed implements Zoo{
    Integer number = 0;
    String type = null;
    @Override
    public Integer number() {
        return this.number;
    }

    @Override
    public String type() {
        return this.type;

    }

    @Override
    public void number(int i) {
        setNumber(i);
        getNumber();

    }

    public Integer getNumber() {return number;}
    public void setNumber(Integer number) {this.number = number;}

    public String getType() {
        return type;
    }
    public void setType(String type) {this.type = type;}

}
