package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(  );
        System.out.println("Enter into array list");
        arrayList.add( "Vipin" );
        arrayList.add( "Varun" );
        arrayList.add( "Vipin" );
        arrayList.add( "Varun" );

        System.out.println("Arraylist size: " +arrayList.size());
        System.out.println(arrayList);
        arrayList.add( "Renu" );
        System.out.println(arrayList);
        System.out.println("At second position: "+arrayList.get(2));
        System.out.println("Change 2nd position with Arun");
        arrayList.set( 2,"Arun" );
        System.out.println("At second position: "+arrayList.get(2));
        System.out.println("Remove 2nd position");
        arrayList.remove( 2 );
        System.out.println("At second position: "+arrayList.get(2));
        System.out.println("Complete list: "+arrayList );
        System.out.println("remove all vipin");
        arrayList.remove( "Vipin" );
        System.out.println("Complete list: "+arrayList );
    }
}
