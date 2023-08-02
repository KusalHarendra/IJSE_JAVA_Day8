import java.util.Arrays;

public class Exercise5 {

    public static void copyValuesFromTo(int[] ar,int[] br){
        for(int i=0;i<ar.length;i++){
            br[i] = ar[i];
        }
    }
    public static void main(String args[]){
        int ar[] = {100,200,300,400,500,600};
        int br[] = new int[ar.length];
        System.out.println(Arrays.toString(ar)); // [100,200,300,400,500,600]
        System.out.println(Arrays.toString(br)); // [0,0,0,0,0,0]

        System.out.println(ar==br); // false

        copyValuesFromTo(ar, br);

        System.out.println(Arrays.toString(ar)); // [100,200,300,400,500,600]
        System.out.println(Arrays.toString(br)); // [100,200,300,400,500,600]
        System.out.println(ar==br); // false
    }

}
