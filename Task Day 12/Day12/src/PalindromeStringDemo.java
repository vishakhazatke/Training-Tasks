import java.util.Locale;
import java.util.Scanner;

public class PalindromeStringDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String to check Palindrome or not");

        String s1 = sc.nextLine();

        s1 = s1.toLowerCase();

        String rev = "";

        for(int i = s1.length()-1; i >= 0; i--){
            rev = rev + s1.charAt(i);
        }

        if(s1.equals(rev)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is not a Palindrome");
        }
        sc.close();
    }
}
