import java.util.*;

class vowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("The Letter is a Vowel.");
            } else {
                System.out.println("Tehe Letter is a Consonant.");
            }
        } else {
            System.out.println("Character not a Letter.");
        }
    }
}