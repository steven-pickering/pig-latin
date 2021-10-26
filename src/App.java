import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();
        String stringToAppend = "ay";
        char firstCharacter = ' ';
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println("Enter a word >");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Your word is > " + input);

//        String firstLetter = input.substring(2);
//        System.out.println("First letter is > " + firstLetter);

        if (firstCharacter == 'a' || firstCharacter == 'e' || firstCharacter == 'i' || +
                firstCharacter == 'o' || firstCharacter == 'u') {
            String pigLatinWord = input + stringToAppend;
            System.out.println("Pig latin word is " + pigLatinWord);
        } else {

            String characterMovedToEnd = input.substring(1) + input.charAt(0);
            String pigLatinWord = characterMovedToEnd + stringToAppend;
            System.out.println("Pig latin word is " + pigLatinWord);
            // move 1st letter to end of string
            //
        }
    }
}
