package may17.generic.ex1;

public class Ex1Test {
    public static void main(String[] args){
        Car<String> car = new Car<>();
        car.set("car");
        System.out.println(car.get());

    }
}
