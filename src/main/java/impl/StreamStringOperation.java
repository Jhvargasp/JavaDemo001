package impl;

import java.util.Arrays;
import java.util.stream.Collectors;


public class StreamStringOperation implements StringOperation {

    /**
     * Basic solution using streams operation and distinct filter, no algorithm usage,
     * per API documentation is recommended send ordered string to have stable results.
     * Pro: easy api usage, distinct uses 'best performant way' to remove and iterate
     * Cons: no algorithm validation
     * @param input
     * @return
     */
    public String removeDuplicatedChars(String input) {
        System.out.println("Sorting using Streams");
        if (null == input) {
            return null;
        }
        return Arrays.stream(input.split("")).distinct().collect(Collectors.joining());
    }
}

