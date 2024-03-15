import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<> ();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        System.out.println ("stringList: "+stringList); //before
        Collections.reverse (stringList);
        System.out.println ("stringList: "+stringList); //after


    }
}