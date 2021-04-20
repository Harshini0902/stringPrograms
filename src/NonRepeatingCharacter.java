import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class NonRepeatingCharacter {

    //First Non repeating character
    public static void main(String[] args) {
        String str="aaabbbcccddde";
        Map<Character,Integer> countMap=new LinkedHashMap<>();
        char[] charArray=str.toCharArray();
        for(Character ch:charArray){
            if(countMap.containsKey(ch)){
             countMap.put(ch,countMap.get(ch)+1);
            }else{
                countMap.put(ch,1);
            }
        }

//        Set<Map.Entry<Character,Integer>> entrySet=countMap.entrySet();
//        for(Map.Entry<Character,Integer> entry:entrySet){
//            if(entry.getValue()==1){
//                System.out.println(entry.getKey());
//                break;
//            }
//        }

        Set<Character> characterSet=countMap.keySet();
        for(Character ch:characterSet){
            if(countMap.get(ch)==1){
                System.out.println("first non-repeating "+ch);
                break;
            }
        }

        for(Character ch:characterSet){
            if(countMap.get(ch)>1){
                System.out.println("first repeating "+ch);
                break;
            }
        }
    }
}
