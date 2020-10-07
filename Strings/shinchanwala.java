import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        boolean[] a1 = new boolean[26];
        boolean[] a2 = new boolean[26];

        for (int i = 0; i < s1.length(); i++) {
            a1[s1.charAt(i) - 'a'] = true;
        }

        for (int i = 0; i < s2.length(); i++) {
            a2[s2.charAt(i) - 'a'] = true;
        }
        int counters1 = 0;
        int counters2 = 0;

        for (int i = 0; i < 26; i++) {

        }

    }
}