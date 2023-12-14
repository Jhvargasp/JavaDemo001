package impl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamStringOperationTest {
    static StringOperation impl;
    @BeforeAll
    static void setup () {
        impl = new StreamStringOperation();
    }

    @Test
    void removeDuplicatedCharNoDuplicated() {
        assertEquals("asdf",impl.removeDuplicatedChars("asdf"));
    }

    @Test
    void removeDuplicatedCharDuplicatedChars() {
        assertEquals("abc",impl.removeDuplicatedChars("aaaabbbccc"));
    }

    @Test
    void removeDuplicatedCharUsingNull() {
        assertEquals(null,impl.removeDuplicatedChars(null));
    }

    @Test
    void removeDuplicatedCharSpacesAndSpecialCharacters() {
        assertEquals("asdf 123☺",impl.removeDuplicatedChars("asdf 123 ☺ asdf 123 ☺"));
    }

    @Test
    void removeDuplicatedCharLongSentence() {
        String longText = new StringBuilder()
                .append("It was the best of times, it was the worst of times,\n")
                .append("it was the age of wisdom, it was the age of foolishness,\n")
                .append("it was the epoch of belief, it was the epoch of incredulity,\n")
                .append("it was the season of Light, it was the season of Darkness,\n")
                .append("it was the spring of hope, it was the winter of despair,\n")
                .append("we had everything before us, we had nothing before us")
                .toString();
        assertEquals("It washebofim,r\n" +
                "gdlnpcuyLDkv"
                ,impl.removeDuplicatedChars(longText));
    }
}