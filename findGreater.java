import java.util.*;

class greater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int n = sc.nextInt();
        System.out.println("Enter Second Number:");
        int m = sc.nextInt();

        if (n > m) {
            System.out.println(n + " is Greater.");
        } else if (m > n) {
            System.out.println(m + " is Greater.");
        } else {
            System.out.println(m + " and " + n + " are equal.");
        }
        sc.close();
    }
}