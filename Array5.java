import java.util.*;

class Array5{
    public static void main(String args[]){
        Random input = new Random();
        int[] marks=new int[10];
        for(int i = 0; i< 10; i++){
            marks[i] = input.nextInt(101); 
        }

        // Find total
        int total = 0;
        for(int i = 0; i< 10; i++){
            total += marks[i];
        }

        // Find Max
        int max = 0;
        for(int i = 0; i< 10; i++){
            if(max<marks[i]){
                max = marks[i];
    
            }
        }

        // Find min
        int min = marks[0];
         for(int i = 1; i< 10; i++){
            if(min>marks[i]){
                min = marks[i];
 
            }
        }

        // print marks --> [23,45,67......78]

        System.out.print("[");
        for(int i = 0; i< 10; i++){
            System.out.print(marks[i] + ",");
        }
        System.out.println("\b]");
        System.out.println("Total : " + total );
        System.out.println("Max : " + max );
        System.out.println("Min : " + min );
    }
}
