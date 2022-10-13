package learn;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class grade {

    public char getGrades(int marks) {
        // return null;
        //Delete the return statement and write code here
        if ((marks >= 80) && (marks <= 100)) {
            return 'A';
        } else if ((marks >= 60) && (marks < 80)) {
            return 'B';
        } else if ((marks >= 40) && (marks < 60)) {
            return 'C';
        } else if ((marks >= 0) && (marks < 40)) {
            return 'F';
        } else {
            return 'X';
        }
    }

    public static void main(String[] args) {
        grade g = new grade();
        System.out.println(g.getGrades(100));
    }

}