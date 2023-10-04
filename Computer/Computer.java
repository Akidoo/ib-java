public abstract class Computer {
    
    private String Type;
    private double primaryMemory;
    private String processor;
    private String GPU;
    private double ram;

    public Computer(String Type, double ram)
    {
        this.Type = Type;
        this.ram = ram;
    }

    public Computer(String Type, String processor, String GPU)
    {
        this.Type = Type;
        this.processor = processor;
        this.GPU = GPU;
    }

    
     public double getPrimaryMemory()
    {
        return primaryMemory;
    }

    public double getRam()
    {
        return ram;
    }

    public void setPrimaryMemory(double newPrimaryMemory)
    {
        primaryMemory = newPrimaryMemory*1.5;
    }
    
    public Computer(String Type) 
    {
        this.Type = Type;

    }

    public String toString() {
        String output = "Computer type: " + this.Type;
        output = output + "\nProcessor: " + this.processor;
        output = output + "\nRAM in GB: " + this.ram;
        //output = output + "\nSSD in GB: " + this.secondaryMemory;
        return output;
    }
}
