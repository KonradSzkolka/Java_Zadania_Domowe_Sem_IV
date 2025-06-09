public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Bird bird = new Bird();
        Dog dog = new Dog();

        System.out.println(dog.getType());
        System.out.println(dog.getType("Wystraszona ciułała")); //Polimorfizam statyczny

        Animal[] animals = {cat, dog, bird};
        for(Animal animal : animals)
        {
             showAnimalInfo(animal);
             System.out.println("################");
        }

        showAnimalInfo(cat);
        System.out.println("------------------");
        showAnimalInfo(bird);
        System.out.println("------------------");
        showAnimalInfo(dog);
    }

    private static void showAnimalInfo(Animal animal) {
        System.out.println(animal.getType());
        animal.talk();
        System.out.println(animal.getNumberOfLegs());
        animal.sleep();
        animal.wakeUp();
    }
}
