package Objectstructures;

public abstract class Product { // ABSTRACT wil zeggen dat je geen instance van product kan maken en dus alleen van Soda en Chips.

    private double price;
    private String name;

       public Product(double price, String name) {
           this.price = price;
           this.name = name;

    }

    public String getName(){
        return name ;
    }

    public double getPrice(){
        return price ;
    }

    @Override
    public String toString() {
        return "Product{" +
                " price= " + price +
                ", name= ' " + name + '\'' +
                '}';
    }


    public static void print(Product product){
        System.out.println(product.toString());

    }



    public static void main(String[] args) {

        Product product = new Soda (1,"Sisi", 1);
        Soda soda = (Soda) product; // CAST - > Soda variabele = Product, dit zorgt ervoor dat je nu de Soda methoden kunt aanroepen voor product.

//      System.out.println(product);
        print(product); // deze doet nu hetzelfde als de System.out.println(product); , maar dan gedefineerd in aparte methode PRINT.

        Stock stock = new Stock(5, soda);
        Storage storage = new Storage();
        storage.addStock(stock);


    }

}
