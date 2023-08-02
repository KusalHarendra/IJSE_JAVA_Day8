public class Excercise3 {

    public static void printReverse(int ar[]){
        System.out.print("[");
        for(int i = ar.length-1; i >= 0; i-- ){
            System.out.print(ar[i] + ",");
        }
        System.out.println("\b]");

    }
    public static void main(String args[]){
        int ar[] = {20,03,94,43,22,55,67,56,88,96,87,56,78,56,67};
        printReverse(ar); //[67,56,78.........03,20]
    }


}
