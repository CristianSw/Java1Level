package lesson7;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 15);
        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat(plate);
//        plate.info();

        Cat[] cats = new Cat[6];
        cats[0] = new Cat("Tuzic", 10);
        cats[1] = new Cat("Murka", 15);
        cats[2] = new Cat("Simona", 20);
        cats[3] = new Cat("Tom", 5);
        cats[4] = new Cat("Smoky", 50);
        cats[5] = new Cat("Mia", 40);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Cat" + cat.getName() + "satiety: " + cat.isSatiety());
            plate.info();
        }

        plate.setFood(200);
        plate.info();
        cats[cats.length - 1].eat(plate);
        System.out.println("Cat" + cats[cats.length - 1].getName() + "satiety: " + cats[cats.length - 1].isSatiety());
        plate.info();
    }
}
