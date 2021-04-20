import java.util.LinkedHashMap;
import java.util.Set;

public class LongestSubstringSimple {
    static void longestSubstring(String inputString)
    {
        //Convert inputString to charArray

        char[] charArray = inputString.toCharArray();

        //Initialization

        String longestSubstring = null;

        int longestSubstringLength = 0;

        //Creating LinkedHashMap with characters as keys and their position as values.

        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();

        //Iterating through charArray

        for (int i = 0; i < charArray.length; i++)
        {
            System.out.println("start"+i);
            char ch = charArray[i];

            //If ch is not present in charPosMap, adding ch into charPosMap along with its position

            if(ch!=' '&& !charPosMap.containsKey(ch))
            {
                charPosMap.put(ch, i);
            }

            //If ch is already present in charPosMap, reposioning the cursor i to the position of ch and clearing the charPosMap

            else if(charPosMap.containsKey(ch))
            {
                i = charPosMap.get(ch);

                charPosMap.clear();
            }

            //Updating longestSubstring and longestSubstringLength

            if(charPosMap.size() > longestSubstringLength)
            {
                longestSubstringLength = charPosMap.size();
                longestSubstring = charPosMap.keySet().toString();

//                StringBuilder stringBuilder=new StringBuilder();
//                Set<Character> keys=charPosMap.keySet();
//                for(Character character:keys){
//                    stringBuilder.append(character);
//                }
//                longestSubstring=stringBuilder.toString();
            }


            System.out.println("end"+i);
        }

        System.out.println("Input String : "+inputString);

        System.out.println("The longest substring : "+longestSubstring);

        System.out.println("The longest Substring Length : "+longestSubstringLength);

    }

    public static void main(String[] args)
    {
        longestSubstring("javaconceptoftheday");

        System.out.println("==========================");

        longestSubstring("geeks for geeks");
    }
}

