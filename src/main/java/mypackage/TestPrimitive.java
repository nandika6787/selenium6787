package mypackage;

import java.util.Arrays;

public class TestPrimitive {

    public static void main(String[] args) {

        boolean x=false;

        if(!x){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        char a ,b,c;
        a='X';
        b=65;
        c='P';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String s="SUBHAMOY";
        char[] t = s.toCharArray();
        System.out.println(Arrays.toString(t));

        int m=8;
        int n=9;
        System.out.println(m+n);

        float m1=8.4f;
        float n1=9.5f;
        System.out.println(m1+n1);

        double m2=8.483838;
        double n2=983838.5838373;
        System.out.println(m2+n2);
    }
}
