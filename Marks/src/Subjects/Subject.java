package Subjects;

import java.util.Scanner;

public class Subject {

    String Branch;
    String[] Courses;
    int[] Marks;

    public Subject(String br, String[] c) {
        Branch = br;
        Courses = c;
        Marks = new int[5];
    }

    public void PrintResult() {
        for (int i = 0; i < Courses.length; i++) {
            System.out.println(" - " + Courses[i] + " : " + Marks[i]);
        }
    }

    public void ModifyResult() {
        Scanner scan = new Scanner(System.in);
        int ch;
        int newMarks;
        for (int i = 0; i < Courses.length; i++) {
            System.out.println(":: " + (i + 1) + " ::");
            System.out.println(Courses[i] + " : " + Marks[i]);
        }
        System.out.println("Pick Which Mark You Want To Modify : ");
        ch = scan.nextInt();
        ch -= 1;
        System.out.println("Enter The New Marks : ");
        newMarks = scan.nextInt();
        Marks[ch] = newMarks;
    }

}
