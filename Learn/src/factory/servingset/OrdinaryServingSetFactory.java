//conc fac
public class OrdinaryServingSetFactory implements ServingSetFactory {
    public Cup createCup() { return new OrdinaryCup(); }
    public Lid createLid() { return new OrdinaryLid(); }
    public Receipt createReceipt() { return new OrdinaryReceipt(); }
}