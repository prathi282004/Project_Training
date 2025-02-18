// Merge Two Sorted LinkedLists
//Merge two sorted LinkedLists<Integer> into a single sorted list.

package basics;

import java.util.*;

public class MergeLinkedList {
    public static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        list1.addAll(list2);

        Collections.sort(list1);
        return list1;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 4, 3, 5, -1));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(6, 9, 8, 7, 10, 0));

        LinkedList<Integer> merged_list = merge(list1, list2);
        System.out.println("Merged Sort : " + merged_list);
    }
}
