import java.util.*;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int arr1[] = new int[26];
        int arr2[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        int noOfUncommonElements = 0;

        for (int i = 0; i < 26; i++) {
            noOfUncommonElements += Math.abs(arr1[i] - arr2[i]);
        }
        System.out.println(noOfUncommonElements);
        sc.close();
    }
}