import java.util.LinkedHashMap;
import java.util.Map;

public class SmallestWindowOwn {
    public static void main(String[] args) {
        String line="this is a test string";
        String pattern="tist";
//Doesn't work in map bcos when we do pattern.get(lineArray[start]) in while loop,its a null pointer exception
        char[] lineArray=line.toCharArray();
        char[] patternArray=pattern.toCharArray();

        Map<Character,Integer> lineCountMap=new LinkedHashMap<>();
        Map<Character,Integer> patternCountMap=new LinkedHashMap<>();
        int c;
        for(c='a';c<='z';c++){
            patternCountMap.put((char) c,0);
        }

        for(Character ch:patternArray){
            patternCountMap.put(ch,patternCountMap.get(ch)+1);
        }

//        for(Character ch:lineArray){
//            if(lineCountMap.containsKey(ch)){
//                lineCountMap.put(ch,lineCountMap.get(ch)+1);
//            }else{
//                lineCountMap.put(ch,1);
//            }
//        }
        int i;
        int lineLen=line.length();
        int patternLen=pattern.length();
        int start = 0;
        int start_index = 0;
        int minLength;
        int windowSize=0;
        int count = 0;
        for(i=0;i<lineLen;i++) {
            if (lineCountMap.containsKey(lineArray[i])) {
                lineCountMap.put(lineArray[i], lineCountMap.get(lineArray[i]) + 1);
            } else {
                lineCountMap.put(lineArray[i], 1);
            }

            if (patternCountMap.containsKey(lineArray[i]) && (lineCountMap.get(lineArray[i]) <= patternCountMap.get(lineArray[i]))) {
                count++;
                System.out.println(count);
            }

            if (count == patternLen) {

                while (patternCountMap.get(lineArray[start])==0 || (lineCountMap.get(lineArray[start])>patternCountMap.get(lineArray[start])) ) {

                    lineCountMap.put(lineArray[start], lineCountMap.get(lineArray[start] - 1));
                    start++;
                }
                windowSize = i + 1 - start;
                minLength = Integer.MAX_VALUE;
                if (windowSize < minLength) {
                    minLength = windowSize;
                    start_index = start;
                }

            }

        }
        System.out.println("hi");
        System.out.println(start_index+" "+windowSize);
        System.out.println(line.substring(start_index,start_index+windowSize));

            }


        }



