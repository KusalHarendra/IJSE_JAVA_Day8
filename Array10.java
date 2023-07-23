import java.util.Arrays;

public class Array10 {
     public static void main(String args[]){
       int ar[] = {50,50,33,45,79,56,45,66,78,56,45,45,67};
       String arString = Arrays.toString(ar);       // a method from Arrays class
       System.out.println(arString);        

       Arrays.sort(ar);     // a method from Arrays class
       System.out.println(Arrays.toString(ar));
    }

}
