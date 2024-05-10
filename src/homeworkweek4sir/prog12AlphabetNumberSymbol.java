package homeworkweek4sir;

import java.util.Scanner;

public class prog12AlphabetNumberSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        //Object creation
        prog12AlphabetNumberSymbol inputValue = new prog12AlphabetNumberSymbol();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(ch);
        //Closing the scanner object
        scanner.close();
    }
    // Find the input value is ALPHABET, DIGIT and SYMBOL
    public void checkInputValueIsAlphabetNumberOrSymbol(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an ALPHABET.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a DIGIT.");
        } else {
            System.out.println(ch + " is a SYMBOL.");
        }
    }}
