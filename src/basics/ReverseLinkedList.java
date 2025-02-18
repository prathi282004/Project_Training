// Linked List Reversal
//Implement a method to reverse a LinkedList<Integer>.

package basics;

import java.util.*;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));

        //TODO don't use built-in function..
        Collections.reverse(list);

        System.out.println("Reversed list : " + list);
    }
}
