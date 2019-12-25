package collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class List_Iterator {

    /**
     * Reverse, LinkedList, Vector
     * @param args
     */
    public static void main(String[] args) {

        List<String> listArr = new ArrayList<String>();
        listArr.add("Aaray List");
        listArr.add("Aaray ");
        Collections.reverse(listArr);
        for (Object item : listArr) {
            System.out.println("Reverse collections--------- "+item);
        }
        for (ListIterator<String> iterator = listArr.listIterator(listArr.size()); iterator.hasPrevious();) {
              final Object listElement = iterator.previous();
              System.out.println("Reverse ---"+listElement);
            }
        
        ListIterator<String> itrIterator = listArr.listIterator();
        while (itrIterator.hasNext()) {
            System.out.println("" + itrIterator.next());
        }
        System.out.println("" + itrIterator.previous());

        List<String> listLinked = new LinkedList<String>();
        listLinked.add("Linked List");
        System.out.println("" + listLinked);
        List<String> listVector = new Vector<String>();
        listVector.add("Vector");
        System.out.println("" + listVector);

    }

}