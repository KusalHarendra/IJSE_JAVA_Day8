import java.util.Arrays;

public class For_each5 {
     public static void main(String args[]){
        int ar[] = {10,20,30,40};
        System.out.println(Arrays.toString(ar));
        for (int i : ar) {
            i++;        //only the values are increased
            System.out.println(i);  //array is not changed
        }
        System.out.println(Arrays.toString(ar));

        for(int i = 0 ; i < ar.length; i++){
            ar[i]++;            //element is  increased
            System.out.println(ar[i]);
        }

        System.out.println(Arrays.toString(ar));    //prints increased values
    }

}
