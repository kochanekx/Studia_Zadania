package Studia.WzorceProjektowe.Zad2.FactoryMethod;

abstract class Logistics {
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
    protected abstract Transport createTransport();

}
