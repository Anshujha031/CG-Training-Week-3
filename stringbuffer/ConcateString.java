package stringbuffer;

public class ConcateString {

    public static void main(String[] args) {


        String[] arr = {"abc", "bcd", "efg"};
        StringBuffer sb = new StringBuffer("");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        String s = sb.toString().trim();
        System.out.println(s);
        System.out.println(s.length());
    }
}

