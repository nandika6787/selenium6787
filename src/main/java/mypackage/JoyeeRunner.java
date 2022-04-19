package mypackage;

public class JoyeeRunner {

    public static void main(String[] args) {
        TV tv =new TV();
        tv.setBrand("TCL1");
        System.out.println("The TV is "+tv.getBrand());

        Animal x = new Cow();
        x.age=10;
        x.name="Moti";
        x.sleep();//upcast
        ((Cow)x).getMilk();//downcast

        x = new Cat();
        x.age=2;
        x.name="Mini";
        x.sleep();




    }
}
