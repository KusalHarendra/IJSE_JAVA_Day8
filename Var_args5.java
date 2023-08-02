public class Var_args5 {
    public static void printTotal(int[] ar){ // int[] ar
        int tot = 0;
        for(int a : ar){
            tot += a;
            System.out.print(a + " + ");
        }
        System.out.println("\b\b= " + tot);
    }

    public static void main(String args[]){
       // printTotal(10,20); // Illegal
       // printTotal(10,20,30); // Illegal
        printTotal(new int[]{10,20,30}); // Legal
    }

}
