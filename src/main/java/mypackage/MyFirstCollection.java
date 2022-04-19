package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyFirstCollection {

    public List<Double> sortList(List<Double> y) {

        List<String> x = new ArrayList<String>();

        List<Double> sortedby = new ArrayList<Double>();
        int n = y.size();
        double temp = 0;
        for(int i=0; i<n; i++){
            for(int j=1; j< (n-i); j++){
                if(y.get(j-1) > y.get(j)){

                    temp =y.get(j-1);
                    y.set(j-1,null);
                    y.set(j-1,y.get(j));
                    y.set(j,null);
                    y.set(j,temp);
                    y.set(j,temp);
                }
            }
        }
        //System.out.println(y);
    return  y;

    }


}
