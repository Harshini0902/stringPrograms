import java.util.Arrays;
import java.util.List;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String str=" Java   is Best ";
      String[] arrOfStr=str.trim().split("\\s+");
int i;
      StringBuilder reverse=new StringBuilder();
      for(i=arrOfStr.length-1;i>=0;i--){
          reverse.append(arrOfStr[i]);
          reverse.append(" ");
      }
    System.out.println(reverse.toString());

}
}