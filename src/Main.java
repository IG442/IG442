public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Барон");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Багира");
        Cat cat3 = new Cat("Василий");
        Cat cat4 = new Cat("Маркиза");
        Cat cat5 = new Cat("Том");

        System.out.println("=== Демонстрация бега и плавания ===");
        dog1.run(150);
        dog1.run(600);
        dog2.swim(5);
        dog2.swim(20);
        cat1.run(100);
        cat1.run(300);
        cat2.swim(10);

        Bowl bowl = new Bowl(25);
        System.out.println("Миска создана с 25 единицами еды.");

        Cat[] cats = {cat1, cat2, cat3, cat4, cat5};

        bowl.addFood(10);

        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("\n=== Сытость котов ===");
        for (int i = 0; i < cats.length; i++) {
            Cat cat = cats[i];
            String status = cat.isSatiety() ? "сыт" : "голоден";
            System.out.println("Кот " + (i + 1) + " (" + cat.name + "): " + status);
        }

        System.out.println("\n=== Статистика ===");
        System.out.println("Всего животных: " + Animal.animalCount);
        System.out.println("Собак: " + Animal.dogCount);
        System.out.println("Котов: " + Animal.catCount);
        System.out.println("Еды в миске осталось: " + bowl.getFood());

        System.out.println("\n=== Демонстрация геометрических фигур ===");
        Figure circle = new Circle(5.0, "Красный", "Черный");
        Figure rectangle = new Rectangle(4.0, 6.0, "Синий", "Зеленый");
        Figure triangle = new Triangle(3.0, 4.0, "Желтый", "Фиолетовый");

        Figure[] figures = {circle, rectangle, triangle};
        String[] names = {"Круг", "Прямоугольник", "Треугольник"};

        for (int i = 0; i < figures.length; i++) {
            System.out.print(names[i] + ": ");
            figures[i].printCharacteristics();
        }
    }
}