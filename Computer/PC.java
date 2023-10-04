public class PC extends Computer {
    private String processor;
    private String GPU;

    PC(String processor, String GPU)
    {
        super("PC");
        getPrimaryMemory();
        this.processor = processor;
        //this.GPU = GPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public void printInfo() {
        
        //System.out.println(processor);
        //System.out.println(GPU);
       }

       public String ToString() 
       {
        return super.toString() + "\nDiscrete GPU: " + this.GPU;

       }
}
