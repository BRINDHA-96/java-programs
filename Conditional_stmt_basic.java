import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cricket = new Scanner(System.in);
        int a = 10, b = 20;
        System.out.print("Enter The Number for compare: ");
        int c = cricket.nextInt(); // User inputs a number
       

        if (a == c || b == c) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}



















