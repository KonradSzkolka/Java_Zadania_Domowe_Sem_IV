public interface Animal {

    String getType();

    void talk();

    int getNumberOfLegs();

    default void sleep()
    {
        System.out.println("Sleeping...");
    }

    default void wakeUp()
    {
        System.out.println("Waking up...");
    }
}
