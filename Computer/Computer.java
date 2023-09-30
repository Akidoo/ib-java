public abstract class Computer {
    
    private String Type;
    private double primaryMemory;


    public Computer(String Type, double primaryMemory) 
    {
        this.Type = Type;

    }

    public void setPrimaryMemory(double primaryMemory)
    {
        this.primaryMemory = primaryMemory*1.5;
    }
}
