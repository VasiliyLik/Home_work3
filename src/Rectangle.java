//создаем класс-наследник от класса "Фигура" -  "Прямоугольник"
public class Rectangle extends Figure {
    final double length;
    final double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
