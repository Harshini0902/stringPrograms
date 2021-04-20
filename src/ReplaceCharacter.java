public class ReplaceCharacter {
    public static void main(String[] args) {
        String str="Programming";
        char gChar='m';
       StringBuilder stringBuilder=new StringBuilder();
       char[] charArray=str.toCharArray();
       int i;
       for(i=0;i<charArray.length;i++){
           if(charArray[i]!=gChar){
               stringBuilder.append(charArray[i]);
           }
       }

       System.out.println(stringBuilder.toString());

       String str2=str.replaceAll(String.valueOf(gChar),"");
       System.out.println(str2);
    }

}
