package mypackage;

public class Square implements Shape {
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


    public Integer sides(int i) {
        setsides(i);
        Integer k = getSides();
        return k;


    }



    public Integer getSides() {
        return sides;
    }

    public void setsides(int j) {
        this.sides = j;



    }
}

