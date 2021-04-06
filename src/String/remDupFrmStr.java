package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class remDupFrmStr {

    public static void main(String[] args) {

        String s="Greek Beer";

        LinkedHashSet set=new LinkedHashSet();

        for (int i=0;i<s.length()-1;i++){

            set.add(s.charAt(i));
        }

        set.forEach(i-> System.out.println(i));
    }
}
