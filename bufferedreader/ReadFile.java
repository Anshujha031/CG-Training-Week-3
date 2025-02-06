package bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


        public static void main(String[] args) {
            String filePath = "F:\\CG-Training\\Week03-(DataStructure)\\Day05-(StringBuilder,StringBuffer)\\src\\bufferedreader\\sample";

            try{
                FileReader fr = new FileReader(filePath);
                BufferedReader br = new BufferedReader(fr);

                String s;
                while((s = br.readLine()) != null){
                    System.out.println(s);
                }
            }catch(IOException e){
                System.out.println("error " + e.getMessage());
            }

        }
    }

