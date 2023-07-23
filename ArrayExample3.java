public class ArrayExample3 {
     public static void main(String args[]){
        int[] marks = {50,50,33,45,79,56,45,66,78,56,45,45,67};

        // print [.....]
        System.out.print("[");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + ",");
        }
        System.out.print("\b]");
    }

}
