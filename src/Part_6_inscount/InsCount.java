package Part_6_inscount;

public class InsCount {
    private static int instanceCounter; // private to prevent someone or something modifying it from outside

    public InsCount() { // InsCount public, cuz it should be public to access it outside the class
        incrementCount(); // increment the count of instances
        System.out.println("Current instance count: " + getInstanceCount()); // output current count value
    }
    private static void incrementCount() // private to prevent someone or something modifying it from outside
    {
        instanceCounter++; // increment instanceCounter
    }

    public static int getInstanceCount() // getter for instanceCount, public because we want to access it from outside
    {
        return instanceCounter;
    }

    public static void main(String[] args)
    {
        System.out.println("\n\u001B[35mPart 6, instances\u001B[0m");
        InsCount a = new InsCount();
        InsCount b = new InsCount();
        InsCount c = new InsCount();

        System.out.println("Total instance count: " + InsCount.getInstanceCount());
    }
}
