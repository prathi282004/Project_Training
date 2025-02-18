// 2) Sort Dates in Ascending Order
//Given a list of Date objects, sort them in ascending order.

package basics;

import java.util.*;

//JR: Review DONE

public class DateAscending {
    public static void main(String[] args) {

        ArrayList<Date> dates = new ArrayList<>();
        dates.add(new Date(2025, Calendar.FEBRUARY, 13));
        dates.add(new Date(2004, Calendar.MAY, 28));
        dates.add(new Date(2005, Calendar.JUNE, 19));
        dates.add(new Date(1980, Calendar.APRIL, 5));

        Collections.sort(dates);

        for (int i = 0; i < dates.size(); i++) {
            System.out.println(dates.get(i));
        }
    }
}
