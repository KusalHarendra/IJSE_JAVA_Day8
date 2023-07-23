public class Array14 {
     public static void main(String args[]){
       int ar[] = {100,200,300};
       System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);   //100 200 300
       increment(ar); 
       System.out.println(ar[0] + " " + ar[1] + " " + ar[2]);   //101 201 301
    }

    public static void increment(int [] ar) {
        ar[0]++;
        ar[1]++;
        ar[2]++;
    }

}
