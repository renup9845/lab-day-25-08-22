/*
   Program of Student Management System
   By Renu
 */

package com.bankApp;
import java.util.ArrayList;
import java.util.Collections;

public class classroom {
    public static void main(String[] args){
        student s1 = new student(9,14,"Roshan",489);
        student s2 = new student(6,16,"Pranav",378);
        student s3 = new student(10,19,"Tanujha",456);
        student s4 = new student(12,20,"Riddhi",467);
        student s5 = new student(14,21,"Anju",498);

        ArrayList<student> a1 = new ArrayList<>();
        a1.add(s1);
        a1.add(s2);
        a1.add(s3);
        a1.add(s4);
        a1.add(s5);

        System.out.println("-----Students according to their Marks-----");
        Collections.sort(a1,new MarksComparator());
        for(student s:a1)
            System.out.println(s.studentId+ " is " +s.studentAge+" and their name is "+s.studentName+" and the marks are "+s.studentMarks );

    }

}
