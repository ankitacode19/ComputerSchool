
import java.util.*;
import java.util.Arrays;

class Solution {
    // Method to sort a string alphabetically
    public static String sortString(String inputString) {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        s1 = sortString(s1);

        int arr[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }

        int flag = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        sc.close();
    }
}