public class Shirt extends Clothing implements ShopFeatures {
    public Shirt(String brand, double price, String colour) {
        super.brand = brand;
        super.price = price;
        super.colour = colour;
    }

    @Override
    public String getProductNumber() {
        return null;
    }
}
