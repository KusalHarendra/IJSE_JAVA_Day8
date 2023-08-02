public class Excercise1 {

    public static void printArray(int ar[]){
        System.out.print("[");
        for(int a : ar){
            System.out.print(a + ",");
        }
        System.out.println("\b]");
    }
    public static void main(String args[]){
        int ar[] = {20,03,94,43,22,55,67,56,88,96,87,56,78,56,67};
        printArray(ar); //20,03,94,43,22,55,67,56,88,96,87,56,78,56,67]
    }

}
