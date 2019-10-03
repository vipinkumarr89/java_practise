package Collections;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(  );
        treeSet.add( "Vipin" );
        treeSet.add( "Varun" );
        treeSet.add( "Arun" );
        treeSet.add( "Tarun" );
        treeSet.add( "Varun" );
        System.out.println(treeSet);
    }
}
