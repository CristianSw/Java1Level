package lesson6;

public class Dog extends Animal {
    private static int countDogs = 0;

    public Dog(String name) {
        super(name);
        countDogs++;
        System.out.println("Animals count are :" + countAnimals);
        System.out.println("Dogs count are:" + countDogs);
    }

    public static int getCountDogs() {
        return countDogs;
    }

    public static void setCountDogs(int countDogs) {
        Dog.countDogs = countDogs;
    }

    @Override
    void swim(final int distance) {
        if (distance <= 10 && distance > 0)
            System.out.println(super.getName() + " swim : " + distance);
        else System.out.println("Dog cannot swim more than 10");
    }

    @Override
    void run(final int distance) {
        if (distance <= 500 && distance > 0)
            System.out.println(super.getName() + " run : " + distance);
        else System.out.println("Dog cannot run more than 500");
    }
}
