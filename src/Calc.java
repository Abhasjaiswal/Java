public class Calc {

    public static String calculator(int num1, int num2, String operation) {
        int result = 0;
        String message;
        switch (operation) {
            case "+":
                result = num1 + num2;
                message = "Sum of " + num1 + " and " + num2 + " is " + result;
                break;
            case "-":
                result = num1 - num2;
                message = "Difference of " + num1 + " and " + num2 + " is " + result;
                break;
            case "*":
                result = num1 * num2;
                message = "Product of " + num1 + " and " + num2 + " is " + result;
                break;
            default:
                message = "Invalid operation! Use +, -, or *.";
        }
        return message;
    }

    public static void main(String[] args) {
            int num1 = Integer.parseInt(args[0]);
            String operation = args[1];
            int num2 = Integer.parseInt(args[2]);

            String result = calculator(num1, num2, operation);
            System.out.println(result);

        
    }
}
