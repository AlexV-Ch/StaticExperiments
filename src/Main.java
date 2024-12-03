//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        Product product1 = new Product("Палатка", 2500);
        System.out.println();
        System.out.println(Product.count);
        System.out.println(Product.totalPrice);
        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());
        Product product2 = new Product("Палатка", 3500);
        System.out.println();
        System.out.println(Product.count);
        System.out.println(Product.totalPrice);
        System.out.println(Product.getCount());
        System.out.println(Product.getAveragePrice());


    }
}