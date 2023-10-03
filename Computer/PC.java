public class PC extends Computer {
    private String processor;
    private String GPU;

    PC(String processor, String GPU)
    {
        super("PC");
        getPrimaryMemory();
        this.processor = processor;
        this.GPU = GPU;
    }

    public void printInfo() {
        System.out.println(processor);
        System.out.println(GPU);
       }
}
