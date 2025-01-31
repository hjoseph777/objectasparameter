package passingobject.com.example;

import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Calculator calculator = new Calculator();

    public static void main(String[] args) {
        Fraction fraction1 = getFractionFromUser("first");
        Fraction fraction2 = getFractionFromUser("second");

        displayResults(fraction1, fraction2);
        scanner.close();
    }

    private static Fraction getFractionFromUser(String ordinal) {
        System.out.printf("Enter %s fraction numerator: ", ordinal);
        int numerator = scanner.nextInt();
        
        int denominator;
        System.out.printf("Enter %s fraction denominator: ", ordinal);
        denominator = scanner.nextInt();
        while (denominator == 0) {
            System.out.print("Enter " + ordinal + " fraction denominator: " + denominator + "\n");
            System.out.print("Denominator cannot be 0 Please enter denominator: ");
            denominator = scanner.nextInt();
        }

        return new Fraction(numerator, denominator);
    }

    private static void displayResults(Fraction f1, Fraction f2) {
        System.out.println("\n");
        Fraction sum = calculator.addFractions(f1, f2);
        Fraction product = calculator.multiplyFractions(f1, f2);
        System.out.println("After Fraction1 and Fraction2 are added: " + calculator.formatResult(sum));
        System.out.println("\n\n");
        System.out.println("After Fractionl and Fraction2 are multiplied: " + calculator.formatResult(product));
    }
}
