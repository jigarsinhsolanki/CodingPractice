package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterOfString {


    public static void main(String[] args) {
        String str = "JigarJig";

        Map<Character, Integer> map = new HashMap();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (map.containsKey(ch)) {

                map.put(ch, map.get(ch) + 1);
            } else {

                map.put(ch, 1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entrySet : map.entrySet()) {
    //        System.out.println("Key = " + entrySet.getKey() + ", Value = " + entrySet.getValue());

            if (entrySet.getValue() == 1) {

                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
}