abstract class Animal {
    static int animalCount = 0;
    static int dogCount = 0;
    static int catCount = 0;

    public Animal() {
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}