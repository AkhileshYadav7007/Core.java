import javax.swing.border.EmptyBorder;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String name;


        java.util.HashMap<Integer, String> map = new java.util.HashMap<> ();
        java.util.HashMap<Integer, String> map1 = new java.util.HashMap<> ();
        map.put (101, " Akhilesh");
        map.put (102, "Rishi");
        map.put (104, " Akhil");
        map.put (103, " Sudhir");
        map.put (105, "Sk");
        map1.put (null, "null");
        System.out.println (map);
        System.out.println (map.containsKey (null));



    }
}