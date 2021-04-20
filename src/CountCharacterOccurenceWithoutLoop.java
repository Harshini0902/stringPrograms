public class CountCharacterOccurenceWithoutLoop {

    public static void main(String[] args) {
        String s = "Java is java again java again";

        char c = 'a';

        int count = s.length() - s.replace(String.valueOf(c), "").length();

        System.out.println("Number of occurances of 'a' in " + s + " = " + count);

        String str1 = "ract";
        String str2 = "tarc";
        boolean ans = anagram(str1, str2);
        if(ans){
            System.out.println("is anagram");
        }else{
            System.out.println("is not anagram");
        }
    }

    public static boolean anagram(String str1,String str2){
        char[] charArray = str1.toCharArray();
        if(str1.length()!=str2.length()){
            return false;
        }
        for (Character ch : charArray) {
            int index=str2.indexOf(ch);
            if(index!=-1){
                str2=str2.substring(0,index)+str2.substring(index+1,str2.length());
            }else{
                return false;
            }
        }
        return str2.isEmpty();
    }

    }
