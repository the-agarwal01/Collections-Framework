package collectionsjava;
import java.util.*;
public class set {
	public static void main(String[] args) {

        

        

//        Set<Integer> set1 = new HashSet<>(); //Unordered Set
       Set<Integer> set1 = new LinkedHashSet<>(); //Sequenced Set
//
//       Set<Integer> set1 = new TreeSet<>();//Ordered Set
       
        set1.add(32);
        set1.add(2);
        set1.add(54);
        set1.add(21);
        set1.add(65);

        System.out.println(set1);

        set1.remove(54);

        System.out.println(set1);

        System.out.println(set1.contains(21));

        System.out.println(set1.isEmpty());

        System.out.println(set1.size());

        set1.clear();

        System.out.println(set1);
//
    }
}
