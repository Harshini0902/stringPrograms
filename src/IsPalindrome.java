public class IsPalindrome {
    public static void main(String[] args) {
        String str="abba";
        String reverse=reverse(str);
        if(str.equals(reverse)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }
    }
//    public static String reverse(String str){
//        if(str.isEmpty()){
//            return str;
//        }
//        return reverse(str.substring(1))+str.charAt(0);
//    }
    //reverse
    public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.charAt(i);

        }
        return reverse;
    }
}
