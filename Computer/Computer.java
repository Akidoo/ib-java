public abstract class Computer {
    
    private String Type;
    private double primaryMemory;


     public double getPrimaryMemory()
    {
        return primaryMemory;
    }

    public void setPrimaryMemory(double newPrimaryMemory)
    {
        primaryMemory = newPrimaryMemory*1.5;
    }
    
    public Computer(String Type) 
    {
        this.Type = Type;

    }
    
}
