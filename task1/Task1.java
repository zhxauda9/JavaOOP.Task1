package JavaOOP.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Phone ph1 = new Phone("77079987076", "iPhone 14", 172.0);
        Phone ph2 = new Phone("7479971609", "Xiaomi 12 Lite");
        Phone ph3 = new Phone("77472661907");

        System.out.println("Phone 1, number: " + ph1.getNumber() + ", model: " + ph1.getModel() + ", weight: " + ph1.getWeight());
        System.out.println("Phone 2, number: " + ph2.getNumber() + ", model: " + ph2.getModel() + ", weight: " + ph2.getWeight());
        System.out.println("Phone 3, number: " + ph3.getNumber() + ", model: " + ph3.getModel() + ", weight: " + ph3.getWeight());

        Scanner sc=new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Input the name of caller"+i+": ");
            String callerName = sc.nextLine();
            System.out.print("Input the number of caller"+i+": +");
            String callerNumber = sc.nextLine();

            switch (i) {
                case 1:
                    ph1.receiveCall(callerName, callerNumber);
                    break;
                case 2:
                    ph2.receiveCall(callerName, callerNumber);
                    break;
                case 3:
                    ph3.receiveCall(callerName, callerNumber);
                    break;
            }
        }
        System.out.print("Input phone number1 to which the message will be sent: +");
        String phoneNum1 = sc.nextLine();
        ph1.sendMessage(phoneNum1);

        System.out.print("Input phone number2 to which the message will be sent: +");
        String phoneNum2 = sc.nextLine();
        ph1.sendMessage(phoneNum2);

        System.out.print("Input phone number3 to which the message will be sent: +");
        String phoneNum3 = sc.nextLine();
        ph1.sendMessage(phoneNum3);

    }
}
