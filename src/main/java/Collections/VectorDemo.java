package Collections;

// Vector is synchronised while arraylist is not
// Queue is first come first out
// Set and Hashset - duplicate are not allowed,
// TreeSet - sorted and unique
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(  );
        System.out.println("size: "+vector.size());
        System.out.println("Capacity: "+vector.capacity());
        System.out.println("Using default capacity i.e., 9");
        for(int i = 1; i<= 9;i++){
            vector.add( i );
        }
        System.out.println("size: "+vector.size());
        System.out.println("Capacity: "+vector.capacity());

        System.out.println("Capacity increased on demand");
        for(int i = 1; i<= 21;i++){
            vector.add( i );
        }
        System.out.println("size: "+vector.size());
        System.out.println("Capacity: "+vector.capacity());

        System.out.println("Capacity decreased on demand");
        for(int i = 1; i<= 11;i++){
            vector.remove( i );
        }
        System.out.println("size: "+vector.size());
        System.out.println("Capacity: "+vector.capacity());
        System.out.println("Once capacity increased can't reduced");
    }

}
