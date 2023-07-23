public class Array11 {
    public static void printArray(int []ar){    //passing an array to a method
        System.out.print("[");
        for(int i = 0 ; i < ar.length; i++){
            System.out.print(ar[i]+ ",");
        }
        System.out.print("\b]");
    }
    public static void main(String args[]){
       int marks[] = {50,50,33,45,79,56,45,66,78,56,45,45,67};
       printArray(marks);
    }

}
