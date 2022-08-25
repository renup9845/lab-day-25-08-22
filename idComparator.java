package com.bankApp;

import java.util.Comparator;

public class idComparator implements Comparator<student> {


    @Override
    public int compare(student s1, student s2) {
        if(s1.studentId == s2.studentId)
        return 0;
        if(s1.studentId>s2.studentId)
            return 1;
        else
            return -1;
    }
}
