package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
        System.out.println("Added food to plate");
    }

    public boolean decreaseFood(int n) {
        int decreasedValue = food - n;

        if (decreasedValue < 0) {
            System.out.println("Its not possible to eat more than is in plate");
            return false;
        } else if (decreasedValue >= 0) {
            food -= n;
            return true;
        }
        return false;
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
