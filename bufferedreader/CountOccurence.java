package bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurence {
    public static void main(String[] args){
        String filePath = "F:\\CG-Training\\Week03-(DataStructure)\\Day05-(StringBuilder,StringBuffer)\\src\\bufferedreader\\sample";

        String target = "Java";

        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String s;
            int count =0;

            while((s = br.readLine()) != null){
                for (String word: s.split(" ")){
                    if(word.equals(target)){
                        count++;
                    }
                }

            }
            System.out.println(count);
        }catch(IOException e){
            System.out.println("Error : " + e.getMessage());
        }


    }
}
