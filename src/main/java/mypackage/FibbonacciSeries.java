package mypackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FibbonacciSeries {
    public static void main(String[] args)throws Exception  {
        System.out.println("First argument is"+args[0]);
        System.out.println("Second argument is"+args[1]);
        Integer N = Integer.parseInt(args[0]);
        Fibbonacci(N);

        MyFirstCollection x = new MyFirstCollection();
        List<Double> y = new ArrayList<Double>();
        y.add(20.6);
        y.add(44.3);
        y.add(233.1);
        y.add(60.6);
        y.add(271.6);
        y.add(20.54);
        y.add(19.53);

        Collections.sort(y);
        System.out.println(y);


    }


        public static void Fibbonacci(Integer N){
            int num1 = 0, num2 = 1;
            int counter = 0;
            while (counter < N) {

                System.out.println(num1 + " ");
                int num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
                counter++;



            }

        }



}
