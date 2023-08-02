public class Var_args2 {

    public static void printTotal(int a, int b){
        int total = a + b;
        System.out.println(a + " + " + b + " = " + total); //creating a method
    }
    public static void printTotal(int a, int b, int c){  
        int total = a + b + c;
        System.out.println(a + " + " + b +  " + " + c + " = " + total); //method overriding
    }
    public static void main(String [] args){
        printTotal(10,20); // 10 + 20 = 30;
        printTotal(10,20,30); // 10 + 20 + 30 = 60;

    }

}