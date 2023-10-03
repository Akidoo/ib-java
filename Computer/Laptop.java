public class Laptop extends Computer {
    
     private int battery;
     private double ram;
     private String name;

      Laptop(double ram, String name, int battery)
     {
        super("Laptop");
      //this.Type = "Laptop";
        getPrimaryMemory();
        this.ram = ram;
        this.name = name;
        this.battery = battery;
     }

     public void printInfo() {
      System.out.println(ram);
      System.out.println(name);
     }

     public void batteryDrain() 
     {
      for(int i = 0; i<100; i++)
      {
         battery = battery-1;
         System.out.println(battery);
      }
     }
}
