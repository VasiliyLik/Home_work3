//создаем класс-наследник от класса "Фигура" -  "Круг"
public class Circle extends Figure {
    final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
