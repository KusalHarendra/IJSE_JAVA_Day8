class Array9{
    public static void main(String args[]){
       int [] xr  = new int[5];
       double[] dr = new double[5];

       dr[0] = xr[0]; // Wider Conversion;
       //xr[1] = dr[1]; // narrow
       xr[1] = (int)dr[1]; // Narrow Casting

       //xr= dr; // Illegal
       //dr = xr; // Illegal
    }
}
