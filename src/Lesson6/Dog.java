package Lesson6;

public class Dog extends Animal {

    public static int dogCount;
    private String name;
    private final int DISTANCE_RUN = 500; // макс дистанция, которую может пробежать собака
    private final int DISTANCE_SWIM = 10; // макс дистанция, которую может проплыть собака

    public Dog(String name) {
        this.name = name;
        dogCount++;
        animalCount++;
    }

    public int getDISTANCE_RUN() {
        return DISTANCE_RUN;
    }

    public int getDISTANCE_SWIM() {
        return DISTANCE_SWIM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if(distance <= getDISTANCE_RUN()) {
            System.out.print(name + " успешно пробежал " + distance + " м. ");
        } else System.out.print(name + " не смог пробежать дистанцию больше " + getDISTANCE_RUN() + " м. ");
    }

    @Override
    public void swim(int distance) {
        if(distance <= getDISTANCE_SWIM()) {
            System.out.print(name + " успешно проплыл " + distance + " м. ");
        } else System.out.print(name + " не смог проплыть дистанцию больше " + getDISTANCE_SWIM() + " м. ");
    }

}
