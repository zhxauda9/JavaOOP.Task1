package JavaOOP.task2;

import java.util.Scanner;

public class Person {
    private String fullName;
    private int age;

    public Person(){
        this.fullName=null;
        this.age=0;
    }
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
    public void move() {
        if (fullName != null) {
            System.out.println(fullName + " is moving.");
        }
        else {
            System.out.println("NoName is moving.");
        }
    }
    public void talk() {
        if (fullName != null) {
            System.out.println(fullName + " is talking.");
        }
        else {
            System.out.println("NoName is talking.");
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();

        Scanner sc = new Scanner(System.in);
        System.out.print("Input full name of person: ");
        String fullName = sc.nextLine();
        System.out.print("Input age of person: ");
        int age = sc.nextInt();
        sc.nextLine();
        Person person2 = new Person(fullName, age);

        person1.move();
        person2.move();
        person1.talk();
        person2.talk();
    }
}

