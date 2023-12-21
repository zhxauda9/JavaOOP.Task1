package JavaOOP.task7.company.vehicles;
import JavaOOP.task7.company.details.Engine;
import JavaOOP.task7.company.professions.Driver;

public class Cars {

    public String carBrand;
    public String carClass;
    public double weight;
    public Driver getnamedriver() {
        Driver name = new Driver();
        return name;
    }
    public String start(){
        return " Let's go!";
    }

    public String stop(){
        return " Let's stop!";
    }

    public String turnright(){
        return "Turn right --> ";
    }

    public String turnleft(){
        return "Turn left <--";
    }

    public String tostring() {
        String info = "Brand: " + carBrand + "\n Class: " + carClass + "\n weight:  " + weight + "\n Driver: " + getnamedriver();
        String info1 = carBrand + " " + start() + "\n";
        String info2 = carBrand + " " + turnleft() + "\n";
        String info3 = carBrand + " " + turnright() + "\n";
        String info4 = carBrand + " " + stop() + "\n";
        return info + info1 + info2 + info3 + info4;
    }
}