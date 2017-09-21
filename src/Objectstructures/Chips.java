package Objectstructures;

public class Chips extends Product{

    private int calories;

    public Chips(double price, String name, int calories) {
        super(price, name);
        this.calories = calories;

    }

    @Override
    public String toString() {
        return "Chips{" +
                "calories=" + calories +
                '}';
    }
}
