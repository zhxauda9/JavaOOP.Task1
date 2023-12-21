package JavaOOP.task6;

public class Aspirant extends Student {
    String scientificWork;
    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }
    @Override
    public String getScholarship(double averageMark) {
        if (averageMark == 5) {
            return "amount of scholarship: $200";
        } else {
            return "amount of scholarship: $180";
        }
    }

}
