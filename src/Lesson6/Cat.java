package Lesson6;

public class Cat extends Animal{

    public static int catCount;
    private String name;
    private final int DISTANCE_RUN = 200; // макс дистанция, которую может пробежать кошка

    public Cat(String name) {
        this.name = name;
        catCount++;
        animalCount++;
    }

    public int getDISTANCE_RUN() {
        return DISTANCE_RUN;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        if(distance <= getDISTANCE_RUN()) {
            System.out.print(getName() + " успешно пробежал " + distance + " м. ");
        } else System.out.print(getName() + " не смог пробежать дистанцию больше " + getDISTANCE_RUN() + " м. ");

    }

    @Override
    public void swim(int distance) {
        System.out.print(getName() + " не стал плыть, кошки не любят плавать. ");
    }

}
