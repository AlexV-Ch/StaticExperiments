public class Product {
    //Создайте класс Product с двумя final-полями — name и price,
    //конструктором с двумя параметрами, с помощью которого можно
    //задавать их значения, и двумя геттерами для этих полей.
private final String name;
private final int price;
    //Создайте также в этом классе два статических поля: int count и int
    //totalPrice — и пропишите увеличение их значений в конструкторе.
    //
    public static int count = 0;
    public static int totalPrice = 0;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
        count = count + 1;
        totalPrice = totalPrice + price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    //Создайте в классе статический метод, который будет возвращать общее
    //количество созданных продуктов:
    public static int getCount() { return count; }
    public static double getAveragePrice() {
        return (double) totalPrice/count;
    }



}
