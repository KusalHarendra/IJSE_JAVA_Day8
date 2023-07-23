public class Array6 {
     public static void main(String args[]){
        // Method 1
        int [] ar = new int[5];
        System.out.println(ar[0] + " " + ar[1] + " " +ar[2]);

        //int[] br = new int[]; // Illegal

        // Method 2
        int[] cr = {10,20,30};
        System.out.println(cr[0] + " " + cr[1] + " " +cr[2]);

        int[] dr;
        //dr = {10.20,30}; // Illegal

        // Method 3
        int er[];
        er = new int[]{10,20,30};
        System.out.println(er[0] + " " + er[1] + " " +er[2]);
    }

}
