public interface Mammal {

    default void sleep()
    {
        System.out.println("Mammal Sleeping...");
    }

    default void wakeUp()
    {
        System.out.println("Mammal Waking up...");
    }
}
