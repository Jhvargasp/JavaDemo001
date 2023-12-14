package impl;
import java.util.HashMap;

public class ArrayStringOperation implements StringOperation {

    /**
     * Complex solution using array verification and maps validation.
     * Pro: algorithm validation
     * Cons: more effort to analize algorithm and perfomance could be lower depending of string length
     * @param input
     * @return
     */
    public String removeDuplicatedChars(String input) {
        System.out.println("Sorting using char array + hashmap + StringBuffer");
        if (null == input) {
            return null;
        }
        char [] chars = input.toCharArray();
        StringBuffer buffer = new StringBuffer();
        HashMap<Character, Integer> map = new HashMap<>();
        for(Character c:chars){
            if (!map.containsKey(c)){
                map.put(c,1);
                buffer.append(c);
            }
        }
        return buffer.toString();
    }
}
