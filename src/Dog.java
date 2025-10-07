class Dog extends Animal {
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;
    private final String name;

    public Dog(String name) {
        super();
        this.name = name;
        dogCount++;
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
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не может плавать " + distance + " м. (максимум " + maxSwimDistance + " м.)");
        }
    }
}