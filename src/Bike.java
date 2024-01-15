public class Bike extends Vehicle implements ShopFeatures {

    public Bike(String name) {
        super.name = name;
        super.type = "Bike";
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getProductNumber() {
        return null;
    }
}
