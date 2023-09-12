public class coffeeCup
{
    String Colour = "White";
    double temp = 30;
    boolean isEmpty = true;
    
    public void printInfo()
    {
        System.out.println(Colour);
        System.out.println(temp);
        System.out.println("Empty: " + isEmpty);
    }

    public void Fill()
    {
        if (isEmpty == true)
        {
            System.out.println("You filled the coffee cup!");
            isEmpty = false;
        }
        
        else
        {
        
            System.out.println("The coffee cup is already full!");
        }
    }
}