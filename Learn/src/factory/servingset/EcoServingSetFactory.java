public class EcoServingSetFactory implements ServingSetFactory {
    public Cup createCup() { return new EcoCup(); }
    public Lid createLid() { return new EcoLid(); }
    public Receipt createReceipt() { return new EcoReceipt(); }
}