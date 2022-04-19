package mypackage;

public class Bycycle {
    public Integer wheels;
    public String padle;

    public String run(){
        return "very fast";


    }
    public String ring(){
        return "bell";

    }

    public void setWheels(Integer a){
        this.wheels= a;
    }

    public Integer getwheels() {
        return this.wheels;
    }
    public void setpadle(String b){
        this.padle=b;
    }
    public String getpadle(){
        return this.padle;
    }

}
