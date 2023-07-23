public class Array13 {
    public static void main(String args[]){
       int ar[] = {100,200,300};
       System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);   //100 200 300
       increment(ar[0], ar[1], ar[2]); // Call by values
       System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);      //100 200 300
    }

    public static void increment(int i, int j, int k) {
        i++;
        j++;
        k++;
    }

}
