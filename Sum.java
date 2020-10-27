import java.util.Scanner;

public class Sum {
    public static void main(String[] args){

        int number1, number2, total;
        Scanner scan = new Scanner(System.in); //Gets user input

        System.out.println("Enter first number: ");
        number1 = scan.nextInt();

        System.out.println("Enter second number: ");
        number2 = scan.nextInt();

        total = number1+number2;

        System.out.println("The total is " + total);
    }
}