package Lesson6;

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать,
 * собака 10 м.).
 * 4. Добавить подсчет созданных котов, собак и животных.
 */

public class MainApp {

    public static void main(String[] args) {
        Animal[] listAnimal = {
                new Cat("Васька"),
                new Cat("Мурка"),
                new Cat("Барон"),
                new Dog("Бим"),
                new Dog("Дейзи"),
        };

        for (Animal animal : listAnimal) {
            animal.swim(8);
            animal.run(550);
            animal.swim(12);
            animal.run(200);
            System.out.println(" ");
        }

        System.out.println("Количество котов: " + Cat.catCount);
        System.out.println("Количество собак: " + Dog.dogCount);
        System.out.println("Количество животных: " + Animal.animalCount);
    }

}
