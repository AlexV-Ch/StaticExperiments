//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TODO: Задание 6.5.2
        Engine engine_1 = new Engine(EngineType.DIESEL, 2, 150);
        Car car_1 = new Car(engine_1, CarType.SUV, 2500);
        System.out.println("Тип автомобиля     - " + car_1.getType());
        System.out.println("Масса автомобиля   - " + car_1.getWeight());
        System.out.println("Тип двигателя      - " + car_1.getEngine().getType());
        System.out.println("Объем двигателя    - " + car_1.getEngine().getVolume());
        System.out.println("Мощность двигателя - " + car_1.getEngine().getPower());


        //TODO: Задание 6.5.1
        /**Напишите в методе main класса Main код, который будет проверять
        работу метода calculate: вызывать его с разными типами операций.*/
        //ArithmeticCalculator calcul = new ArithmeticCalculator(56, 12);
        //System.out.println("Сложение " + calcul.calculate(Operation.ADD) );
        //System.out.println("Вычитание " + calcul.calculate(Operation.SUBTRACT));
        //System.out.println("Умножение " + calcul.calculate(Operation.MULTIPLY));


        //TODO: Задание 6.3 
        /**System.out.printf("Hello and welcome!");
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
         */


    }
}