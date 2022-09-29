import java.util.Arrays;
import java.util.List;

public class Calculator {

    static int i;

    static String longestString;

    static boolean shouldAcceptNullValues;

    /**
     *
     * @return the longest string in the list
     */
    public static Object find_longest_string(List<String> stringList) {
        longestString = "";
        for(i=0; i < stringList.size(); i++) {
            if(!shouldAcceptNullValues) {
                if(stringList.get(i) == null) {
                    throw new Error("null value found!");
                }
            }
            if(longestString.length() < stringList.get(i).length() ) {
                longestString = stringList.get(i);
            }
        }
        return longestString;
    }

}


