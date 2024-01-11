public class Car extends Vehicle {

    public Car(String name){
        super.name = name;
        super.type = "Car";
    }

    @Override
    public void soundWarning() {
        System.out.println("morjens");
    }

}
