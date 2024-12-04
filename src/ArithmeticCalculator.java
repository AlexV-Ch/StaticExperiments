public class ArithmeticCalculator {
    /**Создайте класс ArithmeticCalculator с двумя полями — int a и int b. Также
    создайте в этом классе конструктор тоже с двумя параметрами, который
    будет их сохранять в переменные a и b.*/
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    /**Реализуйте в классе метод calculate, на вход которого передаётся одна
    из арифметических операций (объект класса Operation), которую нужно
    произвести с двумя числами, переданными в конструктор при создании
    объекта.*/
    public int calculate(Operation typee) {
    switch (typee) {
        case ADD -> {return a + b;}
        case SUBTRACT -> {return a - b;}
        case MULTIPLY -> {return a * b;}
            }
            return 0;
    }

}
