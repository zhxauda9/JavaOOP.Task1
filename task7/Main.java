package JavaOOP.task7;

import JavaOOP.task7.company.professions.Driver;
import JavaOOP.task7.company.vehicles.Cars;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cars car1 = new Cars();
        System.out.print("Enter the brand of car: ");
        car1.carBrand = sc.nextLine();
        System.out.print("Enter the car class of car: ");
        car1.carClass = sc.nextLine();
        System.out.print("Enter the weight of car: ");
        car1.weight = sc.nextDouble();
        System.out.println(car1.tostring());

    }
}
