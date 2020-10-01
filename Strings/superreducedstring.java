import java.util.*;

class Solution {
    public static StringBuffer reducer(StringBuffer str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
                str.delete(i, i + 2);
            }
        }

        return str;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        StringBuffer str = new StringBuffer("");
        String input = sc.next();
        str.append(input);
        // till now; we have the input string in our string buffer

        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        str = reducer(str);
        if (str.toString().equals("")) {
            System.out.println("Empty String");
        } else {
            System.out.println(str);
        }
        // !end of the Scanner
        sc.close();
    }
}