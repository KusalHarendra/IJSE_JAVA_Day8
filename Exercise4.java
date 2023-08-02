import java.util.Arrays;

public class Exercise4 {

    public static void incrementSalary(double[] salary, double rate){     
        for(int i = 0; i < salary.length; i++){
            salary[i] = salary[i] *120/100;
        }
    }
        
     public static void main(String args[]){
        double salary[] = {100000.0, 200000.0, 300000.0, 50000.0, 250000.0};
        System.out.println(Arrays.toString(salary));
        incrementSalary(salary, 20.0); // 20-> 20%
        System.out.println(Arrays.toString(salary));
    }

}
