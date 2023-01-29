//создаем класс-наследник от класса "Фигура" -  "Треугольник"
public class Triangle extends Figure {
    final int basis;
    final int height;

    public Triangle(int basis, int height) {
        this.basis = basis;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * basis * height;
    }
}
