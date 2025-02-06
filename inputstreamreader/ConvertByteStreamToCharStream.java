package inputstreamreader;
import java.io.*;

public class ConvertByteStreamToCharStream {
    public static void main(String[] args){
        String filePath = "F:\\CG-Training\\Week03-(DataStructure)\\Day05-(StringBuilder,StringBuffer)\\src\\inputstreamreader\\sample";

        try{
            FileInputStream f = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(f, "ISO-8859-1");
            BufferedReader br = new BufferedReader(isr);

            String s ;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
