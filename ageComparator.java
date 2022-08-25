package com.bankApp;
import java.util.Comparator;

public class ageComparator implements Comparator<student> {
    @Override
    public int compare(student s1, student s2){
        if(s1.studentAge == s2.studentAge) {
            return 0;
        }
        if(s1.studentAge>s2.studentAge)
            return 1;
        else
            return -1;
    }


}
