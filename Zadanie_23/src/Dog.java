public class Dog implements Animal, Mammal {

    @Override
    public String getType() {
        return "Dog ";
    }

    public String getType(String text) {
        return getType() + text ;
    }

    @Override
    public void talk() {
        System.out.println("Woof Woof");
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping...");
    }

    @Override
    public void wakeUp() {
        System.out.println("Dog is Waking...");
    }
}
