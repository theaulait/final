package abbr;

import strq.StringQueue;

import java.util.ArrayList;
import java.util.List;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        String newString = "";

        for(int i = 0; i < string.length(); i ++ ){
            char letter = string.charAt(i);
            if((letter == 'a') || (letter == 'e') || (letter == 'i')|| (letter == 'o') || (letter == 'u')
            || (letter == 'A') || (letter == 'E') || (letter == 'I')|| (letter == 'O') || (letter == 'U')){
                String head = string.substring(0, i);
                String end = string.substring(i + 1);
                newString = head + "" + end;
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));
    }

}
