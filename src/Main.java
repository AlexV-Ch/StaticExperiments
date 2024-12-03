//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        Product product = new Product("Торт Наполеон", 1000);
        Product product1 = new Product("Молоко", 85);
        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());
        System.out.println();
        Product product3 = new Product("Палатка", 2500);
        System.out.println();
        System.out.println(Product.getCount());
        System.out.println(Product.getTotalPrice());
        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());
        Product product2 = new Product("Палатка", 3500);
        System.out.println();
        System.out.println(Product.getCount());
        System.out.println(Product.getTotalPrice());
        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());


    }
}