// 3) Find Duplicate Elements in an Array
//Use a HashSet to find duplicate elements in an ArrayList<Integer>.

package basics;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> val = Arrays.asList(1, 2, 3, 4, 1, 6, 2, 9);
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i = 0; i < val.size(); i++) {
            int num = val.get(i);
            if (unique.contains(num)) {
                duplicate.add(num);
            } else {
                unique.add(num);
            }
        }
        System.out.println("Duplicate elements are : " + duplicate);
    }
}
