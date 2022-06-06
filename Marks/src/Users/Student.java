package Users;

import Subjects.*;

public class Student extends User {

    int AUD;
    Subject Subjects;

    public Student(int id, String n, String br, String[] c, String p) {
        AUD = id;
        name = n;
        Subjects = new Subject(br, c);
        password = p;
    }

    public void displayResults() {
        Subjects.PrintResult();
    }

    public void modifyMarks() {
        Subjects.ModifyResult();
    }

}
