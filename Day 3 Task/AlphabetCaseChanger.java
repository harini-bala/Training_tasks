
import java.util.Scanner;

public class AlphabetCaseChanger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the sentence: ");
        String sentence = scanner.nextLine();


        System.out.println("Enter the Case (lower/upper): ");
        String caseType = scanner.nextLine().toLowerCase();

        String result = "";

        if (caseType.equals("lower")) {
            result = upperToLower(sentence);
        } else if (caseType.equals("upper")) {
            result = lowerToUpper(sentence);
        } else {
            System.out.println("Invalid case type entered!");
            return;
        }

        System.out.println("Converted sentence: " + result);
        scanner.close();
    }

    private static String upperToLower(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static String lowerToUpper(String input) {
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
