import java.util.*;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length");
        int length = sc.nextInt();
        int breadth = sc.nextInt();

        if (length == breadth) {
            System.out.println("It is a Square.");
        } else {
            System.out.println("It is a Rectangle.");
        }
        sc.close();
    }
}
