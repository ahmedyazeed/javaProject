package ReplitsPart2;

class Replits148 {
    String item;
    double price;
    int quantity;

    // Constructor to initialize instance variables
    public Replits148(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate and print the total value of items
    public double itemTotalPrice() {
        double totalValue = price * quantity;
        System.out.println(item + " Total Value " + totalValue);
        return totalValue;
    }

    public static void main(String[] args) {
        // Create two ShoppingStore objects and initialize them
        Replits148 blanket = new Replits148("Blanket", 49.99, 2);
        Replits148 mattress = new Replits148("Mattress", 219.59, 2);

        // Calculate and store the total values for each item
        double blanketTotal = blanket.itemTotalPrice();
        double mattressTotal = mattress.itemTotalPrice();

        // Calculate the sum of both objects' total values
        double totalPurchase = blanketTotal + mattressTotal;

        // Print the total purchase value
        System.out.println("You purchased " + totalPurchase + " Today");
    }
}
