public class Excercise2 {

    public static String toString(int ar []){
        String s = "[";
        for (int a : ar) {
            s+= (a+ ",");
        }
        s += "\b]";
        return s;
 
    }
    public static void main(String args[]){
        int ar[] = {20,03,94,43,22,55,67,56,88,96,87,56,78,56,67};
        String s = toString(ar); 
        System.out.println(s); //[20,03,94,43,22,55,67,56,88,96,87,56,78,56,67]
    }

}
