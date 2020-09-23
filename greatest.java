import java.util.*;

class greatest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x = sc.nextInt();
        System.out.println("Enter Second Number:");
        int y = sc.nextInt();
        System.out.println("Enter Third Number:");
        int z = sc.nextInt();
        if (x > y && x > z) {
            System.out.println("Largest number is:" + x);
        } else if (y > z) {
            System.out.println("Largest number is:" + y);
        } else {
            System.out.println("Largest number is:" + z);
        }
        sc.close();
    }
}