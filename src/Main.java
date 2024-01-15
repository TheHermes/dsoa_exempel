public class Main {
    public static void main(String[] args) {

        /*Car car = new Car("Brita");
        System.out.println(car.getName() + " " + car.getType());
        car.setName("Trina");
        System.out.println(car.getName() + " " + car.getType());
        Bike bike = new Bike("Bruno");
        System.out.println(bike.getName() + " " + bike.getType());

        Shirt diorShirt = new Shirt("Dior", 39.95f, "Brown");
        Shirt plainShirt = new Shirt("Balenciaga", 50.00f, "White");
        plainShirt.setPrice(19.95f);
        diorShirt.setColour("Blue");
        System.out.println(diorShirt.getBrand() + " " + diorShirt.getColour() + " (" + diorShirt.getPrice() + "€)");
        System.out.println(plainShirt.getBrand() + " " + plainShirt.getColour() + " (" + plainShirt.getPrice() + "€)");
        car.soundWarning();*/

        // Code Challenge Lektion 3
        Calculator calc = new Calculator();
        System.out.printf("2 tals multiplikation: %.2f\n", calc.multiply(1, 2));
        System.out.printf("3 tals multiplikation: %.2f\n", calc.multiply(1, 2, 3));
        System.out.printf("4 tals multiplikation: %.2f", calc.multiply(1, 2, 3, 4));



    }
}