package Lesson7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return this.name;
    }

    public boolean getSatiety() {
        return this.satiety;
    }

    public void infoSatiety() {
        System.out.print(" " + getName() + " сытый(ая)? " + getSatiety() + ".");
    }

    public void eat(Plate plate) {
        if(plate.getFood() >= appetite) {
            System.out.print(name + " съел(а): " + appetite + ".");
            plate.decreaseFood(appetite);
            this.satiety = true;
        } else {
            System.out.print(name + " не смог(ла) поесть, не хватает еды в тарелке: " + (appetite - plate.getFood()) + ".");
            this.satiety = false;
        }
    }
}
