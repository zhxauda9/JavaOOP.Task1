package JavaOOP.task5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the value of A: ");
        int A = sc.nextInt();
        System.out.print("Input the value of B: ");
        int B = sc.nextInt();
        System.out.println("Numbers between A to B:");
        if(A<B){
            asc(A,B);
        }
        else if(A==B){
            System.out.println("They're same, there's no numbers between them.");
        }
        else{
            desc(A,B);
        }
    }
    private static void asc(int A, int B) {
        if (A < B) {
            System.out.print(A + " ");
            asc(A + 1, B);
        }
    }
    private static void desc(int A,int B) {
        if (A > B) {
            System.out.print(A + " ");
            desc(A - 1, B);
        }
    }
}
