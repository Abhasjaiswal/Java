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

    int day = 3;
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid Day");
    }

    // Loops
    // for, while, do while

    for (int k = 0; k < 5; k++) {
      // condition check
      System.out.println("Value of k is " + k);
      // increment or decrement
    }

    // difference between while and do while
    // while - first condition check then execute
    // do while - first execute then condition check

    int k = 0;
    while (k < 5) {
      System.out.println("Value of k is " + k);
      k++;
    }

    int l = 0;
    do {
      System.out.println("Value of l is " + l);
      l++;
    } while (l < 5);

    // Jump Statements
    //break, continue, return
    {
      int ss=0;
    }
    system.out.println(ss); // error
                          

    int m=0;
    for(m<5;m++){
      if(m==3){
        break;
      }
      System.out.println("Value of m is " + m);
    }

    System.out.println("Value of m is " + m);


 
        boolean i = true; 

        label1: {
            label2: {
                label3: {
                    System.out.println("In label3 scope ... before the break");
                    if (i) break label2;
                    System.out.println("In label3 scope ... after the break");
                }
                System.out.println("In label3 scope ... after the break wrt label2");
            }
            System.out.println("In label3 scope ... after the break wrt label2");
        }
    }
}

