import java.util.*;

class magic {
    public static void main(String args[]) {
        System.out.println("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        if (inputNumber % 9 == 1)
            System.out.println(inputNumber + " is a Magic Number");
        else
            System.out.println(inputNumber + " is NOT a Magic Number");

        sc.close();
    }
}