public class Main {
    public static void main(String[] args) {
        System.out.println("=== PART A: Factory Method ===");
        
        CoffeeBrewer espressoBrewer = new EspressoBrewer();
        espressoBrewer.brew();

        CoffeeBrewer latteBrewer = new LatteBrewer();
        latteBrewer.brew();

        CoffeeBrewer cappuccinoBrewer = new CappuccinoBrewer();
        cappuccinoBrewer.brew();

        System.out.println("\n=== PART B: Abstract Factory  ===");

        ServingSetFactory servingSetFactory = new EcoServingSetFactory();

        Cup cup = servingSetFactory.createCup();
        Lid lid = servingSetFactory.createLid();
        Receipt receipt = servingSetFactory.createReceipt();

        cup.holdCoffee();
        lid.coverCup();
        receipt.printDetails();
    }
}