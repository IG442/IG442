class Cat extends Animal {
    private final int maxRunDistance = 200;
    private final int maxSwimDistance = 0;
    public final String name;
    private boolean satiety = false;

    public Cat(String name) {
        super();
        this.name = name;
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может бежать " + distance + " м. (максимум " + maxRunDistance + " м.)");
        }
    }

    @Override
    public void swim(int distance) {
        if (maxSwimDistance == 0) {
            System.out.println(name + " не умеет плавать.");
        } else {
            if (distance <= maxSwimDistance) {
                System.out.println(name + " проплыл " + distance + " м.");
            } else {
                System.out.println(name + " не может плавать " + distance + " м.");
            }
        }
    }

    public void eat(Bowl bowl, int amount) {
        if (bowl.eat(amount)) {
            satiety = true;
            System.out.println(name + " поел " + amount + " единиц еды. Теперь сыт.");
        } else {
            System.out.println(name + " не смог поесть " + amount + " единиц еды. Недостаточно еды в миске.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}