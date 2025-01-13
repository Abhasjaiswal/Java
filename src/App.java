public class App {
  public static void main(String[] args) {
    System.out.println("Hello World");  

    int i = 29;
    short j = (short) i;
    float f = 30.4f;

    char c = 'A';

    System.out.print("Val of i is" + i + "this ...");

    int ii =300;

    byte jj= (byte) ii; // 300 % 250 --> j
    System.out.println((jj));
    // ii = 10 % 0;
    System.out.println(ii);
    System.out.println(10.0 / 0.0);
    System.out.println(0.0 / 0.0);
    System.out.println(-10.0 / 0.0);

    double d = 10.0 / 0.0;
    System.out.println(d);
    //System.out.println(double.isInfinite(d));

    // Control Statements 
    // if , if else, if else ladder , switch

    int age = 20;
    if (age > 18) {
      System.out.println("You are eligible to vote");
    } else {
      System.out.println("You are not eligible to vote");
    }

    boolean isEligible = true;
    if (isEligible) {
      System.out.println("You are eligible to vote");
    } else {
      System.out.println("You are not eligible to vote");
    }

    int marks = 90;
    if (marks > 90) {
      System.out.println("Grade A");
    } else if (marks > 80) {
      System.out.println("Grade B");
    } else if (marks > 70) {
      System.out.println("Grade C");
    } else {
      System.out.println("Grade D");
    }

  }
}
