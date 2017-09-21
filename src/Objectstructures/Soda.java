package Objectstructures;

public class Soda extends Product {

    private int sugar;

    public Soda(double price, String name, int sugar) {
        super(price, name);
        this.sugar = sugar;

    }

    @Override
    public String toString() {
        return "Soda{" +
                "sugar= " + sugar +" "+ super.toString()  ;
    }
}
