package ReplitsPart2;

class Replits147 {
    String model;
    double price;
    int quantity;

    // Constructor to initialize instance variables
    public Replits147(String model, double price, int quantity) {
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate and print the stock value of cars
    public void carStockValue() {
        double stockValue = price * quantity;
        System.out.println(model + " Stock Value " + stockValue);
    }
}
