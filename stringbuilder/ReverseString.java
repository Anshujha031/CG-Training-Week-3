package stringbuilder;

public class ReverseString {

    public static String reverse(String s1){
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            sb.append(ch);
        }
        sb.reverse();
        return sb.toString();

    }
    public static void main(String[] args){
        String s = "NaveenJha";
       System.out.println(reverse(s));

    }
}
