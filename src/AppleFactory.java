public class AppleFactory implements DeviceFactory {
    @Override
    public Smartphone createSmartphone() {
        return new AppleSmartphone();
    }

    @Override
    public Laptop createLaptop() {
        return new AppleLaptop();
    }

    public static void main(String[] args) {
        DeviceFactory factory = new AppleFactory();
        Smartphone smartphone = factory.createSmartphone();
        smartphone.getDetails();
    }
}
