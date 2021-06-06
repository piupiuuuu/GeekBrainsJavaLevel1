package Lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return this.food;
    }

    public void decreaseFood(int n) {
        this.food -= n;
    }

    public void increaseFood(int n) {
        this.food += n;
    }
}
