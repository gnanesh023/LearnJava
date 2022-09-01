import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Your String");

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {

                count++;
            }

        }
        System.out.println("Number of vowels in the given sentence is " + count);

    }
}
