import java.util.*;

class Array4{
    public static void main(String args[]){
        Random input = new Random();
        int[] marks=new int[10];
        for(int i = 0; i< 10; i++){
            marks[i] = input.nextInt(101); 
        }

        // Find total
        int total = 0;
        for(int i = 0; i< 10; i++){
            total = total + marks[i];
        }

        // print marks --> [23,45,67......78]

        System.out.print("[");
        for(int i = 0; i< 10; i++){
            System.out.print(marks[i] + ",");
        }
        System.out.println("\b]");
        System.out.println("Total : " + total );
    }
}
