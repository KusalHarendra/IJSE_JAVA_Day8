public class For_each4 {
  public static void main(String args[]){
        int ar[] = {50,50,33,45,79,56,45,66,78,56,45,45,67};
        for(long a : ar){ // Legal
            System.out.print(a + " ");
        }

        /*for(byte a : ar){             // Illegal, cannot do casting
            System.out.print(a + " ");
        }*/
    }

}
