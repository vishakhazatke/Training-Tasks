import java.util.Scanner;

public class PalindromeNoDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to check palindrome or not");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        if(temp == rev){
            System.out.println("The Number is Palindrome Number");
        }
        else{
            System.out.println("The Number is not a Palindrome Number");
        }
        sc.close();
    }
}
