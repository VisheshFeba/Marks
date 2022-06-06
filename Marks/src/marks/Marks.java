package marks;

import Users.*;
import Subjects.*;
import java.util.Scanner;

public class Marks {

    public static void main(String[] args) {

        String[] courses = new String[3];
        courses[0] = "Theory Of Computation";
        courses[1] = "Operating Systems";
        courses[2] = "Java";

        Student Students[] = new Student[3];
        Students[0] = new Student(1, "Viseeesh", "Cse", courses, "123");
        Students[1] = new Student(2, "Feba", "Cse", courses, "abc");
        Students[2] = new Student(3, "Ebrahim", "Cse", courses, "1a2b3c");

        Faculty Faculties[] = new Faculty[3];
        Faculties[0] = new Faculty("Ved", "123");
        Faculties[1] = new Faculty("Mustufa", "123");
        Faculties[2] = new Faculty("Crem", "123");

        int StudentIndex = -1;
        int FacultyIndex = -1;
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("1.Login Student");
            System.out.println("2.Login Faculty");
            System.out.println("3.Exit");
            choice = scan.nextInt();

            switch (choice) {

                case 1: {
                    Scanner scanString = new Scanner(System.in);
                    System.out.println("Enter Name : ");
                    String tempName = scanString.nextLine();
                    System.out.println("Enter Password : ");
                    String tempPass = scanString.nextLine();
                    for (int i = 0; i < Students.length; i++) {
                        if (Students[i].Verify(tempName, tempPass)) {
                            StudentIndex = i;
                            System.out.println("Login Successfull !");

                        }
                    }
                    if (StudentIndex == -1) {
                        System.out.println("Invalid Username Or Password!!");
                    } else {
                        int ch = 0;
                        do {
                            System.out.println("1.Display Marks");
                            System.out.println("2.Logout");
                            ch = scan.nextInt();
                            switch (ch) {
                                case 1:
                                    Students[StudentIndex].displayResults();
                                    break;
                                case 2:
                                    StudentIndex = -1;
                                    break;
                            }
                        } while (ch != 2);
                    }
                }
                break;

                case 2:
                    Scanner scanString = new Scanner(System.in);
                    System.out.println("Enter Name : ");
                    String tempName = scanString.nextLine();
                    System.out.println("Enter Password : ");
                    String tempPass = scanString.nextLine();
                    for (int i = 0; i < Faculties.length; i++) {
                        if (Faculties[i].Verify(tempName, tempPass)) {
                            FacultyIndex = i;
                            System.out.println("Login Successfull !");

                        }
                    }
                    if (FacultyIndex == -1) {
                        System.out.println("Invalid Username Or Password!!");
                    } else {
                        System.out.println("Welcome " + Faculties[FacultyIndex].GetName());
                        int ch = 0;
                        do {
                            System.out.println("1.Modify Marks");
                            System.out.println("2.Logout");
                            ch = scan.nextInt();
                            switch (ch) {
                                case 1:
                                    int x;
                                    for (int i = 0; i < Students.length; i++) {
                                        System.out.println((i + 1) + ". " + Students[i].GetName());
                                    }
                                    System.out.println("Pick A Student To Modify : ");
                                    x = scan.nextInt();

                                    x -= 1;
                                    Students[x].modifyMarks();
                                    break;
                                case 2:
                                    FacultyIndex = -1;
                                    break;
                            }
                        } while (ch != 2);
                    }
                    break;

            }

        } while (choice != 3);

    }

}
