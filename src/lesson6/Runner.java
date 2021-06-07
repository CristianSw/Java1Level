package lesson6;

public class Runner {


    public static void main(String[] args) {


        Dog dog1 = new Dog("Bobic");
        Dog dog2 = new Dog("Tuzic");
        Dog dog3 = new Dog("Bim");

        Cat cat1 = new Cat("Sparky");
        Cat cat2 = new Cat("Smoothy");
        Cat cat3 = new Cat("Murka");


        dog1.run(150);
        dog1.swim(300);
        dog2.run(300);
        dog2.swim(5);
        dog3.run(400);
        dog3.swim(10);

        cat1.run(20);
        cat1.swim(100);
        cat2.run(200);
        cat2.swim(5);
        cat3.run(300);
        cat3.swim(2000);

    }
}
