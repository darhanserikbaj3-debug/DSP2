public class Espresso implements AbstractCoffee {
    @Override 
    public void prepare() {
        System.out.println("Making a shot of espresso. Wait about 5 minutes");
    }
}


