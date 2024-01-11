public class Main {
    public static void main(String[] args) {

        Car car = new Car("Brita");
        System.out.println(car.getName() + " " + car.getType());
        car.setName("Trina");
        System.out.println(car.getName() + " " + car.getType());
        Bike bike = new Bike("Bruno");
        System.out.println(bike.getName() + " " + bike.getType());
    }
}