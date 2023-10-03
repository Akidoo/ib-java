public class computerTest {
    public static void main(String[] args) {
        Laptop newLaptop = new Laptop(16, "Dell", 100);
        PC newPC = new PC("Ryzen 5 2600", "ASUS Dual RTX 3060");

        newLaptop.printInfo();
        newLaptop.batteryDrain();

        newPC.printInfo();
    }
}
