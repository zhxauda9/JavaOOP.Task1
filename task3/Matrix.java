package JavaOOP.task3;
import java.util.Scanner;

public class Matrix {
    private double[][] elem;
    private int n, m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        elem = new double[n][m];
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(elem[i][j] + " "+"\n");
            }
        }
    }

    public Matrix add(Matrix other) {
        if (n != other.n || m != other.m) {
            return null;
        }
        Matrix res = new Matrix(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res.elem[i][j] = elem[i][j] + other.elem[i][j];
            }
        }
        return res;
    }

    public void multiply(double san) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                elem[i][j] *= san;
            }
        }
    }

    public static void main(String[] args) {
        Matrix a = new Matrix(2, 2);
        a.elem[0][0] = 1;
        a.elem[0][1] = 2;
        a.elem[1][0] = 3;
        a.elem[1][1] = 4;

        Matrix b = new Matrix(2, 2);
        b.elem[0][0] = 5;
        b.elem[0][1] = 6;
        b.elem[1][0] = 7;
        b.elem[1][1] = 8;

        System.out.println("Matrix A:");
        a.print();
        System.out.println("Matrix B:");
        b.print();
        System.out.println("Sum:");
        Matrix sum = a.add(b);
        if (sum != null) {
            sum.print();
        }
        System.out.println("Input number to multiplicate matrix:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        a.multiply(number);
        a.print();
    }
}