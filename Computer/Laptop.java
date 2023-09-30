public class Laptop extends Computer {
    
     private int battery;
     private double ram;

     public void setxy(double a, double b)
     {
      setPrimaryMemory(a);
      ram = b;
     }

     Laptop(int battery, String Type, double ram)
     {
        super("Laptop", primaryMemory);
        //this.Type = "Laptop";
        this.battery = 100;
        setPrimaryMemory(ram*1.5);
     }
}
