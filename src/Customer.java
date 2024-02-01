public class Customer {
    private double funds;
    private Bike currentBike;
    public Customer(double funds) {
        this.funds = funds;
    }
    public void buyBike(Bike bike) {
        if(funds < bike.getPrice()){
            System.out.println("You cannot no handle my bikes!");
            return;
        }
        setFunds(funds - bike.getPrice());
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public Bike getCurrentBike() {
        return currentBike;
    }

    public void setCurrentBike(Bike currentBike) {
        this.currentBike = currentBike;
    }
}
