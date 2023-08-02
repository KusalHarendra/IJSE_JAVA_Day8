public class For_each3 {
    public static void main(String args[]){
        int ar[] = {50,50,33,45,79,56,45,66,78,56,45,45,67};
        for(int a : ar){
            System.out.print(a + " ");
        }
       // System.out.print(a + " "); // Illegal, variable a cannot be run outside the loop
    }
 
}
