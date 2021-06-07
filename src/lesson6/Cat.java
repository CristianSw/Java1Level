package lesson6;

public class Cat extends Animal {

    private static int countCats = 0;

    public Cat(String name) {
        super(name);
        countCats++;
        System.out.println("Animals count are :" + countAnimals);
        System.out.println("Cats count are:" + countCats);
    }

    public static int getCountCats() {
        return countCats;
    }

    public static void setCountCats(int countCats) {
        Cat.countCats = countCats;
    }

    @Override
    void swim(final int distance) {
        System.out.println("Cats cannot swim");
    }

    @Override
    void run(final int distance) {
        if (distance <= 200 && distance > 0)
            System.out.println(super.getName() + " run : " + distance);
        else System.out.println("Cat cannot run more than 200");
    }


}
