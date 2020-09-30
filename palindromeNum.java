import java.util.*;

class CheckPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check Palindrome:");
        int n = sc.nextInt();
        int temp = n;
        int d = 0, c;

        while (n > 0) {
            c = n % 10;
            d = (d * 10) + c;
            n = n / 10;
        }

        if (d == temp) {
            System.out.println(temp + " is a palindrome number.");
        } else {
            System.out.println(temp + " is not a palindrome number.");
        }
        sc.close();
    }
}