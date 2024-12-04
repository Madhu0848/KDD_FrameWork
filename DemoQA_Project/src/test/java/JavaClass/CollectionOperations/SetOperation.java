package JavaClass.CollectionOperations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOperation {
    public static void main(String[] args) {

     Set<Object> set = new HashSet();
     set.add(1);
     set.add(9);
     set.add(7);
     set.add(3);
     set.add(5);
     set.add("hello");
     System.out.println(set.size()+"Set");
     System.out.println(set+"Set");

     LinkedHashSet<Object> set1 = new LinkedHashSet();
     set1.add(1);
     set1.add(9);
     set1.add(7);
     set1.add("hello");
     System.out.println(set1.size()+"Set");
     System.out.println(set1+"Set");

    }
}
