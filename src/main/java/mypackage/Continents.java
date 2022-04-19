package mypackage;
import java.util.ArrayList;
import java.util.List;
public class Continents {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Asia");
        list.add("Europe");
        list.add("Africa");
        list.add("N.America");
        list.add("S.Amarica");
        list.add("Australia");
        list.add("Antarctica");

        System.out.println("Name of the Continents:" + list);

        int size = list.size();
        System.out.println("Number of the continents =" + size);





    }
}
