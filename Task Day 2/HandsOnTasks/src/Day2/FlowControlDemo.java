package Day2;

public class FlowControlDemo{

    public static void main(String[] args) {

        // 1. Using '=' instead of '==' in conditions

        int x = 5;

        // if (x = 5)  //  WRONG 

        if (x == 5)    //  Correct

            System.out.println("x is 5");

        // 2. Neglecting braces {} leading to logic errors

        System.out.println("Neglecting braces example:");

        //  WRONG: Only first line belongs to if

        if (x == 5)

            System.out.println("Inside IF");

        System.out.println("This runs always (logic error)");

        // Correct use of braces

        if (x == 5) {

            System.out.println("Inside IF with braces");

            System.out.println("Both lines run only when condition is true");

        }

        // 3. Infinite loop due to wrong condition

        System.out.println("\nInfinite loop example (fixed):");

        int i = 1;

        // while (i <= 1)  // ❌ If i never changes → infinite loop

        //     System.out.println("Infinite loop");

        // Correct loop

        while (i <= 1) {

            System.out.println("Loop runs once");

            i++;  // exits loop correctly

        }

        // 4. Break vs return confusion

        System.out.println("\nBreak vs Return:");

        for (int j = 1; j <= 5; j++) {

            if (j == 3) {

                System.out.println("Using break → stops the loop only");

                break;   // Exits loop only

            }

        }

        System.out.println("After break, main() continues");

        if (x == 5) {

            System.out.println("Using return → exits the method");

            return;   // Exits entire method

        }

        // This line will NOT run because return has already executed

        System.out.println("This will never print");

    }

}
 
