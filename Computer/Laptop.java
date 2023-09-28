public class Laptop extends Computer {
    
     private int battery;

     Laptop(int battery, String Type, double primaryMemory)
     {
        super("Laptop", primaryMemory);
        //this.Type = "Laptop";
        this.battery = 100;
     }
}
