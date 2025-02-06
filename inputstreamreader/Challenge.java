package inputstreamreader;

import javax.print.DocFlavor;
import java.io.*;

public class Challenge {
    public static void main(String[] args){
        String list = "hello";
        int time = 1000000;
        String filePath = "F:\\CG-Training\\Week03-(DataStructure)\\Day05-(StringBuilder,StringBuffer)\\src\\inputstreamreader\\sample";

        StringBuilder sb = new StringBuilder("");
        //calculating time before append
        long beforebuilder = System.nanoTime();

        //append using the string builder
        for(int i=0;i<time;i++){
            sb.append(list);
        }
        //calculating time after append
        long afterbuilder = System.nanoTime();
        long timeBuilderTaken = (afterbuilder - beforebuilder);


        StringBuffer bf = new StringBuffer("");

        long beforeBuffer = System.nanoTime();

        for(int i=0;i<time;i++){
            bf.append(list);
        }

        long afterBuffer = System.nanoTime();

        long timeBufferTaken = afterBuffer - beforeBuffer;

        System.out.println("Time taken by StringBuffer : " + timeBufferTaken);
        System.out.println("Time taken by StringBuilder : " + timeBuilderTaken);


        //FileReader

        int count =0;
        long totalTimeTakeFileReader = 0;
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);

            String s;
            while((s = br.readLine()) != null){
              String[] arr =  s.split("\\s+");


              long timeBeforeFileReader = System.nanoTime();
              for(int i=0;i< arr.length;i++) {
                  count++;
              }
              long timeAfterFileReader = System.nanoTime();

              totalTimeTakeFileReader = timeAfterFileReader - timeBeforeFileReader;
            }
            

        }
        catch (IOException e){
            System.out.println("Error : " + e.getMessage());
        }
        System.out.println("Word Count that reads by fileReader : " + count);
        System.out.println("Time taken by the FileReader : " + totalTimeTakeFileReader);



    //InputStreamReader


    int countInputStream = 0;
    long calculateTimeTakenByInputStream = 0;
    try{
      FileInputStream fre = new FileInputStream(filePath);
        InputStreamReader inst = new InputStreamReader(fre);
        BufferedReader bfe = new BufferedReader(inst);

        String str;
        while((str = bfe.readLine()) != null){
            String[] arr1 = str.split("\\str+");

            long timeTakenBeforeInputStream = System.nanoTime();
            for(int i=0;i<arr1.length;i++){
                countInputStream++;
            }
            long timeTakenAfterInputStream = System.nanoTime();
            calculateTimeTakenByInputStream = timeTakenAfterInputStream - timeTakenBeforeInputStream ;
        }
    }
    catch (IOException e) {
        System.out.println(e.getMessage());
    }
        System.out.println("Word count that reads by InputStream : " + countInputStream);
        System.out.println("Time taken by InputStream : " + calculateTimeTakenByInputStream);

    }

}
