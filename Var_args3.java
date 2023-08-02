public class Var_args3 {

    public static void printTotal(int... ar){       //using Var-args
        int total = 0;
        for(int a : ar){
            total = total + a;
            System.out.print(a + " + ");
        }
        System.out.println("\b\b= " + total);
    }
    public static void main(String [] args){
        printTotal(10,20);
        printTotal(10,20,30,40);
    }
}
