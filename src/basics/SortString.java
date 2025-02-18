// Sort Strings by Length
// Given a list of strings, sort them by length using Collections.sort() and a custom comparator.

package basics;

import java.util.*;
//JR Review DONE
public class SortString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango", "Pomegranate", "Orange", "Cherry", "Plum");

        list.sort(Comparator.comparingInt(String::length));

        System.out.println("Sorted Strings by Length: " + list);
    }
}
