class For_each1{
    public static void main(String args[]){
        int ar[] = {50,50,33,45,79,56,45,66,78,56,45,45,67};
        for(int i = 0; i< ar.length; i++){
            System.out.print(ar[i] + " ");
        }

        System.out.println();

        // Using for-each
        for(int a : ar){
            System.out.print(a + " ");
        }
    }
}
