public class computerTest {
    public static void main(String[] args) {
        Laptop newLaptop = new Laptop(16, "Dell", 100);

        newLaptop.printInfo();
        newLaptop.batteryDrain();
    }
}
