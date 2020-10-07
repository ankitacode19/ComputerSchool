import java.util.*;

class Solution {
    public static int checksos(String str) {
        int counterrors = 3;
        int correctans = 0;

        if (str.substring(0, 1).equals("S")) {
            correctans++;
        }
        if (str.substring(1, 2).equals("O")) {
            correctans++;
        }
        if (str.substring(2, 3).equals("S")) {
            correctans++;
        }

        return counterrors - correctans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i = i + 3) {
            count = count + checksos(str.substring(i, i + 3));
        }
        System.out.println(count);
    }
}