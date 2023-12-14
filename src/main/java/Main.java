import impl.ArrayStringOperation;
import impl.StreamStringOperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("****Remove duplicated characters.****");
        System.out.println("Enter string sentence to evaluate");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading data using readLine
        String input = reader.readLine();

        System.out.println("Enter string sentence without duplicate characters:");
        // Printing the read line
        System.out.println( new StreamStringOperation().removeDuplicatedChars(input));
        System.out.println( new ArrayStringOperation().removeDuplicatedChars(input));

    }
}