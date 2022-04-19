package mypackage;

public class Animal {

    public String name =null;
    public Integer age =0;

    public void sleep(){
        System.out.println("From animal I am sleeping....");
    }

    public void eat(){
        System.out.println("From animal I am eating....");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
