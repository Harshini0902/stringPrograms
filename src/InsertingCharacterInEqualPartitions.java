import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class InsertingCharacterInEqualPartitions {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str= sc.nextLine();
        List<String> parts = new ArrayList<String>();
        int len = str.length();
        int partitionSize=3;
        for (int i = 0; i < len; i += partitionSize) {
            parts.add(str.substring(i, Math.min(len, i + partitionSize)));
        }
        System.out.println(parts+""+ parts.size());
        Optional<String> String_combine=parts.stream().map(s ->s.concat("m")).reduce((str1, str2) -> str1.concat(str2));
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }

//Toggle case Program
        char[] ch=str.toCharArray();
        int i;
        int size=ch.length;
        for(i=0;i<size;i++){
            if(Character.isUpperCase(ch[i])){  //(int)ch[i] >=65 && (int)ch[i]<=90
                ch[i]=(char)(ch[i]+32);//ascii value of uppercase is 65 to 90 and lowercase is 97 to 122

            }
            else if(Character.isLowerCase(ch[i])){
                ch[i]=(char)(ch[i]-32);
            }
        }
        System.out.println("toggle case : "+String.valueOf(ch));

String str1="hello";
String str2="hello";
str2=str1.concat("m");
System.out.println(str1.hashCode()+":"+str2.hashCode()+":"+str1+":"+str2);
    }



}
