package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        for(int i = 11; i<=20;i++) {
            data.add( i );
        }
        System.out.println(data);

        System.out.println("Interating element using get method");
        for (int i = 0; i< data.size();i++){
            Integer j = data.get( i );
            System.out.print( j+"\t");
        }

        System.out.println("\nAnother method using for ex. loop");
        for (Integer n : data){
            System.out.print(n+"\t");
        }

        System.out.println("\nAnother method using Iterator");
        Iterator<Integer> iterator = data.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }

        System.out.println("\nAnother method using list Iterator and applicable for\nclasses which implemented from list Interface");
        ListIterator<Integer> listIterator = data.listIterator();
        System.out.println(listIterator);
        while (listIterator.hasPrevious()){
            Integer iprev = listIterator.previous();
            System.out.print(iprev+"\t");
        }
    }
}
