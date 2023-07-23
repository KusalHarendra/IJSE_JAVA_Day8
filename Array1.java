import java.util.*;

class Example{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int[] ar=new int[10];
        for(int k = 0; k< 10; k++){
            System.out.print("Input Number "+(k+1)+" : ");
            ar[k] = input.nextInt(); 
        }
    }
}

