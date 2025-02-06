package inputstreamreader;

import java.io.*;

public class ReadUser {
    public static void main(String[] args){
        String filePath = "F:\\CG-Training\\Week03-(DataStructure)\\Day05-(StringBuilder,StringBuffer)\\src\\inputstreamreader\\sample";

        try {
//            FileInputStream fis = new FileInputStream(filePath);
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);
            FileWriter fw = new FileWriter(filePath , true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Enter text (type 'exit' to quit):");
            String line;

            while (!(line = bf.readLine()).equalsIgnoreCase("exit")) {
                bw.write(line);
                bw.newLine();
            }

            // Close resources properly
            bw.close();
            fw.close();
            bf.close();
            in.close();

            System.out.println("Input saved to output.txt");
        }
        catch(IOException e){
            System.out.println("Error : " + e.getMessage());


        }
    }
}
