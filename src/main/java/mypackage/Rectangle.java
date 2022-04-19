package mypackage;

public class Rectangle implements Shape {
    Integer sides = 0;
    String types = null;
    @Override
    public Integer sides() {
        return this.sides;
    }

    @Override
    public String types() {
        return this.types;
    }

    public Integer getSides() {
        return sides;
    }

    @Override
    public Integer sides(int i){
        setsides(i);
        int d = getSides();
        return d;


    }

    public void setsides(int p) {
        this.sides = p;
    }







}
