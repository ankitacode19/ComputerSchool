import java.util.*;

class Solution {
    // todo returns the true value if the string length is min of 6 or greater than
    // todo 6
    public static boolean minLength(String str) {
        if (str.length() >= 6) {
            return true;
        } else {
            return false;
        }
    }

    // todo ! @ # $ % ^ & * ( ) - +
    // todo if it contains special character (returns true for a Special Character)
    public static boolean specialCharacter(String str) {
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("!") || str.substring(i, i + 1).equals("@")
                    || str.substring(i, i + 1).equals("#") || str.substring(i, i + 1).equals("$")
                    || str.substring(i, i + 1).equals("%") || str.substring(i, i + 1).equals("^")
                    || str.substring(i, i + 1).equals("&") || str.substring(i, i + 1).equals("*")
                    || str.substring(i, i + 1).equals("(") || str.substring(i, i + 1).equals(")")
                    || str.substring(i, i + 1).equals("-") || str.substring(i, i + 1).equals("+")) {
                flag = 1;
                return true;
            }
        }
        if (flag == 0) {
            return false;
        } else {
            return true;
        }
    }

    // todo check for lowercase
    public static boolean lowercase(String str) {
        if()
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        // todo Status of length
        boolean lengthStatus = minLength(str);
        boolean specialCharacterStatus = specialCharacter(str);

    }
}