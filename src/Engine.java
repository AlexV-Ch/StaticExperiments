public class Engine {

    /**Создайте класс Engine, добавьте в него final-свойства «Тип двигателя»
     (enum EngineType), «Объём» (тип double) и «Мощность» (тип int),
    конструктор и геттеры для всех этих свойств.*/

    private final EngineType type;
    private final double volume;
    private final int power;

    public Engine(EngineType type, double volume, int power) {
        this.type = type;
        this.volume = volume;
        this.power = power;
    }

    public EngineType getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

}
