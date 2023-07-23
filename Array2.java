import java.util.*;

class Array2{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] marks=new int[10];
        for(int i = 0; i< 10; i++){
            System.out.print("Input Number "+(i+1)+" : ");
            marks[i] = input.nextInt(); 
        }
        // print marks --> [23,45,67......78]

        System.out.print("[");
        for(int i = 0; i< 10; i++){
            System.out.print(marks[i] + ",");
        }
        System.out.println("\b]");
    }
}
