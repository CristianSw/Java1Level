package lesson6;

public abstract class Animal {

    public Animal(String name) {
        this.name = name;
        countAnimals++;
    }


    private String name;
    public static int countAnimals = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public static void setCountAnimals(int countAnimals) {
        Animal.countAnimals = countAnimals;
    }

    public static void displayAnimalCount(){
        System.out.println("Animal count is : " + getCountAnimals());
    }


    abstract void swim(int distance);

    abstract void run(int distance);
}
