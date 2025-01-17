
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        // int num1 = Integer.parseInt(args[0]);
        // String operation = args[1];
        // int num2 = Integer.parseInt(args[2]);
        
        // int Result = 0;
        // switch (operation) {
        //     case "+":
        //         Result = num1 + num2;
        //         System.out.println("The sum is : " + Result);
        //         break;
        //     case "-":
        //         Result = num1 - num2;
        //         System.out.println("The difference is : " + Result  );

        //         break;
        //     case "*":
        //         Result   = num1 * num2;
        //         System.out.println("The product is : " + Result);

        //         break;
        }
    }

    public static int calculator(int num1, int num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return num1 / num2;
            case "%":
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot find remainder with divisor zero.");
                }
                return num1 % num2;
            default:
                throw new IllegalArgumentException("Invalid operation! Use +, -, *, /, or %.");
        }
    }