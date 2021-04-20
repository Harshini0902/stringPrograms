import java.util.Arrays;

public class AnagramCheck {

    public static boolean isAnagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }
        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }
    /* * Another way to check if two Strings are anagram or not in Java * This method assumes that both word and anagram are not null and lowercase * @return true, if both Strings are anagram. */
    public static boolean iAnagram(String word, String anagram){
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
        return Arrays.equals(charFromWord, charFromAnagram); }


    public static void main(String[] args) {
        boolean answer=isAnagram("army","mary");
        System.out.println(answer);
        boolean ans=iAnagram("cart","arct");
        System.out.println(ans);
    }

}