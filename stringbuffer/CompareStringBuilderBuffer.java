package stringbuffer;

public class CompareStringBuilderBuffer {
    public static void main(String[] args){

        int numString = 1000000;
        StringBuilder sb1 = new StringBuilder("");
        long startBuilder = System.nanoTime();
        for(int i=0;i<numString;i++){
            sb1.append("Naveen");

        }
        long endBuilder = System.nanoTime();
      long timeTakenBuilder =  endBuilder - startBuilder;

        StringBuffer sb2 = new StringBuffer("");
        long startBuffer = System.nanoTime();
        for(int i=0;i<numString;i++){
            sb2.append("Naveen");
        }
        long endBuffer = System.nanoTime();
        long timeTakenBuffer = endBuffer - startBuffer;
        System.out.println("Time taken StringBuffer is : " + timeTakenBuffer);
        System.out.println("Time taken StringBuilder is : " + timeTakenBuilder);

    }
}
