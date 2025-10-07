class Bowl {
    private int food;

    public Bowl(int initialFood) {
        this.food = Math.max(0, initialFood);
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске: " + food + " единиц.");
        }
    }
    public boolean eat(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getFood() {
        return food;
    }
}