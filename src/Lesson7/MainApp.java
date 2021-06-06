package Lesson7;

/**
 * 1. Расширить задачу про котов и тарелки с едой.
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 * (например, в миске 10 еды, а кот пытается покушать 15-20).
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
 * (хватило еды), сытость = true.
 * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
 * (это сделано для упрощения логики программы).
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию
 * о сытости котов в консоль.
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

public class MainApp {

    public static void main(String[] args) {

        Plate plate = new Plate(40);

        Cat[] catsArray = {
                new Cat("Барсик", 20),
                new Cat("Мурка", 10),
                new Cat("Барон", 30),
                new Cat("Бусинка", 5),
        };

        for (Cat cat : catsArray) {
            cat.eat(plate);
            cat.infoSatiety();
            System.out.println(" ");
        }

        System.out.println("Количество еды в тарелке: " + plate.getFood() + ".");
        System.out.println("Добавить добавку в тарелку: " + 100);
        plate.increaseFood(100);
        System.out.println("Количество еды в тарелке после добавки: " + plate.getFood() + ".");

    }

}
