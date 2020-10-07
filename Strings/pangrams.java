import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean checkAlphabet[] = new boolean[26];

        str = str.toLowerCase(); // to lowercase
        str = str.replaceAll(" ", "");

        for (int i = 0; i < str.length(); i++) {
            checkAlphabet[str.charAt(i) - 'a'] = true;
        }

        int flag = 0;
        for (int i = 0; i < 26; i++) {
            if (checkAlphabet[i] == false) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("not pangram");
        } else if (flag == 0) {
            System.out.println("pangram");
        }
        sc.close();
    }
}