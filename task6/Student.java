package JavaOOP.task6;

public class Student {
    String firstName, lastName, group;
    double averageMark;

    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getScholarship(double averageMark) {
        if (averageMark == 5) {
            return "amount of scholarship: $100";
        } else {
            return "amount of scholarship: $80";
        }
    }

}
