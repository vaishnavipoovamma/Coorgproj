import java.util.Scanner;

public class controlstructure {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the age");
        // int age = sc.nextInt();
        // if (age >= 18)
        // System.out.println("elegibil to vote");
        // else
        // System.out.println("not eligible to vote");
        // if-else
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        if (a > b)
            System.out.println("first number is larger");
        else
            System.err.println("second number is larger");

    }

}
