public class App1 {
    public static void main(String[] args) {
        boolean i = true;

        label1: {
            label2: {
                label3: {
                    System.out.println("In label3 scope ... before the break");
                    if (i) break label2; 
                    System.out.println("In label3 scope ... after the break");
                }
                System.out.println("In label2 scope ... after the break wrt label2");
            }
            System.out.println("In label1 scope ... after the break wrt label2");
        }

        // Working with continue statement
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
            if (j % 2 == 0) {
                continue;
            }
            System.out.println();
        }

        // Number system examples
        int l = 0123; // Octal number system
        int m = 0x123; // Hexadecimal number system
        int n = 0b1010; // Binary number system

        System.out.println("Octal: " + l);
        System.out.println("Hexadecimal: " + m);
        System.out.println("Binary: " + n);

        // Working with continue and labeled break
        outer: for (int i1 = 0; i1 < 5; i1++) {
            for (int j = 0; j < 5; j++) {
                if (j > i1) {
                    System.out.println();
                    continue outer;
                }
                System.out.print(" " + (i1 * j));
            }
        }
    }
}

