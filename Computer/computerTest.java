public class computerTest {
    public static void main(String[] args) {
        Laptop newLaptop = new Laptop(16, "Dell", 100);
        PC newPC = new PC("Ryzen 5 2600", "ASUS Dual RTX 3060");
        newPC.setGPU("ASUS Dual RTX 3060");
        newLaptop.setRam(16);

       // newLaptop.printInfo();
        newLaptop.batteryDrain();
        System.out.println(newLaptop.ToString());

        //newPC.printInfo();
        //System.out.println(newPC.getGPU());
    }
}
