public class Animal {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик");
        Dog dog2 = new Dog("Шарик");
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Васька");

        System.out.println("Всего животных: " + Animal.getTotalAnimals());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        dog1.run(400);
        dog1.run(600);
        dog1.swim(5);
        dog1.swim(15);

        cat1.run(150);
        cat1.run(250);
        cat1.swim(5);

        Bowl bowl = new Bowl(25);
        Cat[] cats = {cat1, cat2, cat3};

        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        bowl.addFood(20);
        System.out.println("Добавлено 20 еды в миску. Теперь в миске: " + bowl.getFoodAmount());

        System.out.println("\nИнформация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + ": сыт - " + cat.isSatiety());
        }
    }

    protected String name;
    private static int totalAnimals = 0;

    public Animal(String name) {
        this.name = name;
        totalAnimals++;
    }

    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;
    private static final int MAX_RUN_DISTANCE = 500;
    private static final int MAX_SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может проплыть больше " + MAX_SWIM_DISTANCE + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;
    private boolean satiety = false;
    private static final int APPETITE = 10;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl) {
        if (bowl.decreaseFood(APPETITE)) {
            satiety = true;
            System.out.println(name + " покушал из миски и тепер сыт.");
        } else {
            System.out.println(name + " не хватает еды в миске, он не стал есть.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int initialFood) {
        foodAmount = initialFood;
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}