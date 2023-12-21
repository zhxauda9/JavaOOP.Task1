package JavaOOP.task4;
/*
1.	FULL NAME,
2.	library card number
3.	faculty,
        4.	Date of Birth,
        5.	phone.
6.	takeBook(), returnBook() methods.
7.	Develop a program that creates an array of objects of a given class.
        8.	Overload the takeBook(), returnBook() methods:
        - takeBook, which will accept the number of books taken. Displays the message "Petrov VV took 3 books" on the console.
- takeBook, which will accept a variable number of book titles. Displays the message "Petrov VV took books: Adventures, Dictionary, Encyclopedia" on the console.
- takeBook, which will accept a variable number of objects of the Book class (create a new class containing the name and author of the book). Displays the message "Petrov VV took books: Adventures, Dictionary, Encyclopedia" on the console.
9.	Similarly, overload the returnBook() method. Displays the message "Petrov VV returned the books: Adventures, Dictionary, Encyclopedia" to the console. Or "V. V. Petrov returned 3 books."
*/


import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Input the full name of library user " + i + " : ");
            String fn = sc.nextLine();
            System.out.print("Input the card number of library user " + i + " : ");
            int cn = sc.nextInt();
            sc.nextLine();
            System.out.print("Input the faculty of library user " + i + " : ");
            String fc = sc.nextLine();
            System.out.print("Input the birthdate of library user " + i + " : ");
            String bd = sc.nextLine();
            System.out.print("Input the phone of library user " + i + " : ");
            String ph = sc.nextLine();
            System.out.print("Input the number of books of library user " + i + " : ");
            int bk = sc.nextInt();
            switch (i) {
                case 0:
                    readers[i] = new Reader(fn, cn, fc, bd, ph, bk);
                    break;
                case 1:
                    readers[i] = new Reader(fn, cn, fc, bd, ph, bk);
                    break;
                case 2:
                    readers[i] = new Reader(fn, cn, fc, bd, ph, bk);
                    break;
            }
        }
        Book[] books = new Book[3];

        books[0] = new Book("Book1", "Author1");
        books[1] = new Book("Book2", "Author2");
        books[2] = new Book("Book3", "Author3");

        for (int i = 0; i < 3; i++) {
            System.out.println(readers[i].takebooks() + books[i].takebooksname());
            System.out.println(readers[i].returnbooks() + books[i].takebooksname());
        }
    }
}
