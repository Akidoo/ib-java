public class Laptop extends Computer {
    
     private int battery;
     private double ram;

     Laptop(int battery, String Type, double ram)
     {
        super("Laptop", primaryMemory);
        //this.Type = "Laptop";
        this.battery = 100;
        getPrimaryMemory();
     }
}
