public class Cat implements Animal, Mammal {

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void talk() {
        System.out.println("Meow");
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public void sleep() {
        System.out.println("Cat Sleeping...");
    }

    @Override
    public void wakeUp() {
        Animal.super.wakeUp();
        Mammal.super.wakeUp();
    }
}
