public class Car {

    /**Создайте также класс Car, добавьте в него final-свойства «Двигатель»
            (класс Engine), «Тип» (enum CarType) и «Вес» (тип int), создайте
    конструктор и геттеры для всех этих свойств.*/

    private final Engine engine;
    private final CarType type;
    private final int weight;

    public Car(Engine engine, CarType type, int weight) {
        this.engine = engine;
        this.type = type;
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public CarType getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }
}
