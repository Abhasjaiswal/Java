public class App2 {
    public static void main(String[] args) {
        double area = areaOfTriangle(10, 20);
        System.out.println("Area of the triangle is: " + area);

        double interest = SI(1000, 5, 2);
        System.out.println("Simple Interest is: " + interest);
    }

    public static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static double SI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}

