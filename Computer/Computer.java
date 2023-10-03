public abstract class Computer {
    
    private String Type;
    private double primaryMemory;


     public double getPrimaryMemory()
    {
        return primaryMemory;
    }

    public void setPrimaryMemory(double newPrimaryMemory)
    {
        primaryMemory = newPrimaryMemory;
    }
    
    public Computer(String Type, double primaryMemory) 
    {
        this.Type = Type;

    }
    
}
