public class Array12 {
     public static void main(String args[]){
       int ar[] = {100,200,300};
       System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);
       increment(ar[0], ar[1], ar[2]);
       System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);
    }

    public static void increment(int i, int j, int k) {
        i++;
        j++;
        k++;
    }

}
