public class Latte implements AbstractCoffee {
    @Override 
    public void prepare() {
        System.out.println("Making a shot of latte. Wait about 6 minutes");
    }
}
