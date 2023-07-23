public class MainCar {
     public static void main(String [] args){
        ExampleCar exampleCar = new ExampleCar();

        exampleCar.isStart = true;     //can access these
        exampleCar.speed = 50;         //can access these
      
        System.out.println("Is start : " + exampleCar.isStart);
        System.out.println("Speed : " + exampleCar.speed);

        ExamplePrivateCar examplePrivateCar = new ExamplePrivateCar();
        
        //examplePrivateCar.isStart = true;       //cannot access to private attributes
        //examplePrivateCar.speed = 100;          //cannot access to private attributes

        //System.out.println("Is start : " + examplePrivateCar.isStart);
        //System.out.println("Speed : " + examplePrivateCar.speed);

     }
}
