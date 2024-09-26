
import java.util.Scanner;

public class simplecalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the first number ");
        double num1 = sc.nextDouble();
        System.out.println(" Enter the second number ");
        double num2 = sc.nextDouble();
        System.out.println(" choose an  operation ( + , - , * , / , % ): ");
        char operator = sc.next().charAt(0);
        double result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;

                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println(" Error ! by divison zero ");
                    return;

                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;

                } else {
                    System.out.println(" Error ! by divison zero ");
                    return;
                }
                break;
            default:
                System.out.println("invalid operator ");
                break;
        }
        System.out.println(" The result is " + result);

    }
}