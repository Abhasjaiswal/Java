public class App4 {
    public static void main(String[] args) {
        // [attributes/properties,action/behaviour/methods] --> Classes 
        // [variables,methods] --> Objects

        // Class --> Design/Blueprint
        // Object --> Instance of a class
        // We need to create an object in order to use the class that we have created 
        int i=6;
        int j=10;

        // Object Creation - Syntax
        // ClassName objectName = new ClassName();
    
        Compute comp = new Compute();
        comp.num1 = i;
        comp.num2 = j;
        System.out.println("Addition : " + comp.add());
        System.out.println("Subtraction : " + comp.subtract());
        System.out.println("Multiplication : " + comp.multiply());
        

    }
}

class Compute {
    // Attributes
    int num1;
    int num2;

    // Methods
    public int add() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multiply() {
        return num1 * num2;
    }

    public int divide() {
        return num1 / num2;
    }
}