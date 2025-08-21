import java.util.Scanner;

public class TwoDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2-digit number: ");
        int num = sc.nextInt();

        if(num < 10 || num > 99) {
            System.out.println("Please enter a valid 2-digit number!");
            return;
        }

        int tens = num / 10;       
        int units = num % 10;

        int sum = tens + units;
        System.out.println("Sum of digits: " + sum);
    }
}