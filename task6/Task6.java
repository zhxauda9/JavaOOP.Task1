package JavaOOP.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        String lname = "";
        String group = "";
        double mark = 0;
        String scwork = "";
        Student student = null;
        Aspirant aspirant = null;
        for (int i = 1; i <= 2; i++) {
            System.out.print("Input student's first name: ");
            name = sc.nextLine();
            System.out.print("Input student's last name: ");
            lname = sc.nextLine();
            System.out.print("Input the student's group: ");
            group = sc.nextLine();
            System.out.print("Input the student's average mark: ");

            mark = sc.nextDouble();
            sc.nextLine();

            switch (i) {
                case 1:
                    student = new Student(name, lname, group, mark);
                    break;
                case 2:
                    System.out.print("Input the name of scientific work: ");
                    scwork = sc.nextLine();
                    aspirant = new Aspirant(name, lname, group, mark, scwork);
                    break;
            }
        }
        Student[] students = {student, aspirant};

        for (Student s : students) {
            if (s instanceof Aspirant) {
                System.out.println("Scholarship for " + s.firstName + " " + s.lastName + ": $" + s.getScholarship(s.averageMark));
            } else {
                System.out.println("Scholarship for " + s.firstName + " " + s.lastName + ": $" + s.getScholarship(s.averageMark));
            }
        }
    }
}
