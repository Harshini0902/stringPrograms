import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String string = "geeks for geeks";

        char[] chars = string.toCharArray();
        Set<Character> charSet = new LinkedHashSet<Character>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        System.out.println(sb.toString());


        //string to primitive int
        int i=Integer.parseInt("123");
        System.out.println(i);

        //integer to string
        String str=String.valueOf(123);
        System.out.println(str);
    }


}
