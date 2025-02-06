package stringbuilder;

import java.util.HashSet;

public class RemoveDuplicate {

    public static String dplicate(String s) {
        StringBuilder sb = new StringBuilder("");
        HashSet<Character> set = new HashSet<>();

        for (int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }



        }
        return sb.toString();
    }


    public static void main(String[] args){
        String s = "AAbbcd";
         String s1 = dplicate(s);
         System.out.println(s1);

    }
}
