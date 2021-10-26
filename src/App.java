import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        String stringToAppend = "ay";
        String pigLatinWord = null;
        char firstCharacter = ' ';

        System.out.println("Enter a word >");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Your word is > " + input);


        if (firstCharacter == 'a' || firstCharacter == 'e' || firstCharacter == 'i' || +
                firstCharacter == 'o' || firstCharacter == 'u') {
            pigLatinWord = input + stringToAppend;
            System.out.println("Pig latin word is " + pigLatinWord);
        } else {
            String characterMovedToEnd = input.substring(1) + input.charAt(0);
            pigLatinWord = characterMovedToEnd + stringToAppend;
            System.out.println("Pig latin word is " + pigLatinWord);
        }
    }
}
